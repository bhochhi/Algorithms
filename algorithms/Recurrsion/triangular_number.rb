class TriangularNumber
  # To change this template use File | Settings | File Templates.
  total =0;

  def triangle(nth)
    return 1 if nth==1
    return (nth + triangle(nth-1))
end
end

triangle = TriangularNumber.new

ARGV.each do |arg|
  puts triangle.triangle arg.to_i
end
