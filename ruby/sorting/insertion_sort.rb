class InsertionSort

  def sort(array)

    1.upto(array.size-1) do |j|
      i=j;
      element = array[j]
      while i>0 && array[i-1]>element
        array[i] = array[i-1]
        i-=1
      end
      array[i] = element
    end
    return array
  end

end



sort = InsertionSort.new
array = [23, 45, 67, 88, 13]
puts "Before #{array}"
arr = sort.sort(array)
puts "After #{arr}";
