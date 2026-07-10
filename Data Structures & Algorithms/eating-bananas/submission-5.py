
class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        left = 1
        right = max(piles)

        minRange = -1

        while (left < right):
            mid = (left + right) // 2

            currentH = 0

            for i in range (0, len(piles)):
                currentH += math.ceil(piles[i] / mid)


            if currentH > h:
                left = mid + 1
                continue

            if ((minRange > mid) or (minRange == -1)):
                minRange = mid
                right = mid

            elif (minRange != -1) and (minRange < mid):
                return minRange

        if (minRange == -1):
            return left
        
        return minRange

        