class AnalgramPermutation

  def display_analgram(word)
       word.to_s.chars.each do |c|
        puts c
       end

  end
end

AnalgramPermutation.new.display_analgram "Rupesh"