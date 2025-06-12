<h2><a href="https://leetcode.com/problems/third-maximum-number">414. Third Maximum Number</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code>, return <em>the <strong>third distinct maximum</strong> number in this array. If the third maximum does not exist, return the <strong>maximum</strong> number</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,1]
<strong>Output:</strong> 1
<strong>Explanation:</strong>
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2]
<strong>Output:</strong> 2
<strong>Explanation:</strong>
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,2,3,1]
<strong>Output:</strong> 1
<strong>Explanation:</strong>
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2&#39;s are counted together since they have the same value).
The third distinct maximum is 1.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Can you find an <code>O(n)</code> solution?

<h1>Solution : </h1>
<p>
	<li>The time complexity of the below solution is O(n) because each insertion/removal is O(1) (due to small fixed size) and we do it for each of the n elements.</li>
<li>
	Also the Space complexity is also O(n) as the TreeSet holds at most 4 unique numbers, so it uses constant space.</li>
</p>

<p>
	<ol>
  <li><strong>TreeSet properties:</strong> The treeSet stores elements in <em>ascending order</em> and automatically removes <em>duplicates</em>.</li>

  <li>In the first part, we iterate over each number in the input array:
    <ul>
      <li>Add the number to the TreeSet.</li>
      <li>If the TreeSet size exceeds 3, we use <code>pollFirst()</code> to remove the <em>smallest</em> number — this ensures that we only keep the top 3 largest unique values.</li>
    </ul>
  </li>

  <li>After processing all elements:
    <ul>
      <li>If TreeSet has exactly 3 elements, return we use <code>set.first()</code>, which gives the third maximum (smallest among the top 3 elements).</li>
      <li>If TreeSet has less than 3 unique numbers, return <code>set.last()</code>, which gives the maximum.</li>
    </ul>
  </li>
</ol>
</p>
