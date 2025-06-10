<h2><a href="https://leetcode.com/problems/contains-duplicate-ii">219. Contains Duplicate II</a></h2><h3>Easy</h3><hr><p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <code>true</code> <em>if there are two <strong>distinct indices</strong> </em><code>i</code><em> and </em><code>j</code><em> in the array such that </em><code>nums[i] == nums[j]</code><em> and </em><code>abs(i - j) &lt;= k</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1], k = 3
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,0,1,1], k = 1
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1,2,3], k = 2
<strong>Output:</strong> false
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>5</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>0 &lt;= k &lt;= 10<sup>5</sup></code></li>
</ul>

<p>
	<ul>
		<li>The first part in my code which is commented out will give TLE as the size of array increases.</li>
		<li>For the second attempt, we reate a HashMap to store the most recent index of each element first and then start traversing  the array one by one.<ol>
			<li>As we start traversing, we create a variable which keeps track of the current element. </li>
			<li>Now we check if the element we are currently on has been seen before has been seen before or not and if the difference between current index and last index is less than or equal to k or not.<ul>
				<li>If yes, return true.</li>
				<li>Else put the index of that element in the hashMap and continue traversing the array.</li>
			</ul></li>
		</ol></li>
	</ul>
</p>
