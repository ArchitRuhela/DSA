<h2><a href="https://leetcode.com/problems/intersection-of-two-arrays">349. Intersection of Two Arrays</a></h2><h3>Easy</h3><hr><p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their <span data-keyword="array-intersection">intersection</span></em>. Each element in the result must be <strong>unique</strong> and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [9,4]
<strong>Explanation:</strong> [4,9] is also accepted.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>

<h1> Solution : </h1>
<p>
	<ul>
		<li>This question is solved in two parts:
		<ol>
			<li>At the start, you should create a hashset to store unique values.</li>
			<li>Now, we are using two loops to iterate over the two arrays(nums1 and nums2) to check if the elements we are on, are equal or not. And if the elements are equal, we add it to the hashset we created.</li>
			<li>Now create and array and remember the size of the array is same as that of the hashset.</li>
			<li>In the second part, we are getting each element of the hashset and are adding it to  the array we created.</li>
			<li>At last we get our intersection array as output.</li>
		</ol></li>
	</ul>
</p>
