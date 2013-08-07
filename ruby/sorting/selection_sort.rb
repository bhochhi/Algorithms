class SelectionSort
  # To change this template use File | Settings | File Templates.
  def sort(array)

    (array.size-1).downto(0) do |j|
      loc = j;
      0.upto(j) do |i|
        if (array[i]>array[loc])
          loc = i;
        end
      end
      array[j],array[loc] =  array[loc],array[j]
    end
    return array
  end
end


sort = SelectionSort.new
array = [23, 45, 67, 88, 13]
puts "Before #{array}"
arr = sort.sort(array)
puts "After #{arr}";