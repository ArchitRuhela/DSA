<h2><a href="https://leetcode.com/problems/search-insert-position">35. Search Insert Position</a></h2><h3>Easy</h3><hr><p>Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.</p>

<p>You must&nbsp;write an algorithm with&nbsp;<code>O(log n)</code> runtime complexity.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 5
<strong>Output:</strong> 2
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 2
<strong>Output:</strong> 1
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,3,5,6], target = 7
<strong>Output:</strong> 4
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>4</sup> &lt;= nums[i] &lt;= 10<sup>4</sup></code></li>
	<li><code>nums</code> contains <strong>distinct</strong> values sorted in <strong>ascending</strong> order.</li>
	<li><code>-10<sup>4</sup> &lt;= target &lt;= 10<sup>4</sup></code></li>
</ul>

<h1>Solution : </h1>
<ul>
	<li>In this problem we have to find the index where the target is found and if the target is not in the array, then we have to return the index where the target would be placed if inserted in order.</li>
	<li>Here we use three conditions to check for the above situations:-
	<ol>
		<li>First, we traverse the whole array and check if the target is found. If yes we return the index of that element.</li>
		<li>If the target is not found, then we check if the element in the array we are traversing on is greater than the target. If yes, then return the index the of the current element on which we are checking the condition on.</li>
		<li>Otherwise, return the index of last element, i.e., the element is larger than all the elements and will we inserted at the last position.</li>
	</ol>
	</li>
</ul>
