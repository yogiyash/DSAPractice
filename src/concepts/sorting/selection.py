
i = 0;

arr = [64, 25, 12, 22, 11,2,1,0,9,7,-1]

for i in range(len(arr)):
    for j in (range(i+1,len(arr))):
        if(arr[j]<arr[i]):
            arr[i],arr[j] = arr[j],arr[i]

print(arr)