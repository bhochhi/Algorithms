class BubbleSort



  def bubble_sort(array)
    (array.size - 1).downto(1).each do |j|
      1.upto(j).each do |i|
        if(array[i]>array[i-1])
          array[i],array[i-1] = array[i-1],array[i]
        end
      end
    end
    return array
  end
end


sort = BubbleSort.new
array = [23,45,67,88,23]
puts "Before #{array}"
arr = sort.bubble_sort(array)
puts "After #{arr}";