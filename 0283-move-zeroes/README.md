<h2>283. Move Zeroes</h2>

<p><strong>Difficulty:</strong> Easy</p>

<p><strong>Description:</strong><br>
Given an integer array <code>nums</code>, move all <code>0</code>'s to the end of it while maintaining the relative order of the non-zero elements.</p>

<p><strong>Note:</strong> You must do this in-place without making a copy of the array.</p>

<h3>Example 1:</h3>
<pre>
<strong>Input:</strong> nums = [0,1,0,3,12]
<strong>Output:</strong> [1,3,12,0,0]
</pre>

<h3>Example 2:</h3>
<pre>
<strong>Input:</strong> nums = [0]
<strong>Output:</strong> [0]
</pre>

<h3>Constraints:</h3>
<ul>
  <li>1 &lt;= nums.length &lt;= 10<sup>4</sup></li>
  <li>-2<sup>31</sup> &lt;= nums[i] &lt;= 2<sup>31</sup> - 1</li>
</ul>

<h1>Solution : </h1>
<ul>
  <li>The swap function <strong>Swaps elements</strong> at indices <code>i</code> and <code>j</code> in the array.</li>
  <li>The pointer <code>p</code> tracks the position to place the next non-zero element.</li>
  <li>The pointer <code>sp</code> iterates through the array to find non-zero elements.</li>
  <li>When a non-zero element is found in the array, we <strong>swap it</strong> with the element at position <code>p</code>.This <strong>brings the non-zero forward</strong> and pushes zeros toward the end of the array.</li>
  <li>After each swap, <code>p</code> is incremented to point to the next available position for placing a non-zero.</li>
  <li>At last, we get our sorted array in which all the zeros are at the end position and the order of all the other elements is still maintained.</li>
</ul>
