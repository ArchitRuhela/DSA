<h2><a href="https://leetcode.com/problems/intersection-of-two-arrays-ii">350. Intersection of Two Arrays II</a></h2><h3>Easy</h3><hr><p>Given two integer arrays <code>nums1</code> and <code>nums2</code>, return <em>an array of their intersection</em>. Each element in the result must appear as many times as it shows in both arrays and you may return the result in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [1,2,2,1], nums2 = [2,2]
<strong>Output:</strong> [2,2]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums1 = [4,9,5], nums2 = [9,4,9,8,4]
<strong>Output:</strong> [4,9]
<strong>Explanation:</strong> [9,4] is also accepted.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums1.length, nums2.length &lt;= 1000</code></li>
	<li><code>0 &lt;= nums1[i], nums2[i] &lt;= 1000</code></li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong></p>

<ul>
	<li>What if the given array is already sorted? How would you optimize your algorithm?</li>
	<li>What if <code>nums1</code>&#39;s size is small compared to <code>nums2</code>&#39;s size? Which algorithm is better?</li>
	<li>What if elements of <code>nums2</code> are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?</li>
</ul>

<h1> Solution : </h1>
<p>
	<ul>
		<li>This is the second part of the the intersection of two arrays problem. In the first part we had to store unique elements in the output array so we used hashset, but that is not the case here. We have to store the values as many times as they show in both arrays, so we can use arraylist here.</li>
		<li>In this we check three conditions since we have to check each element of nums1 with each element of nums2:
		<ol>
			<li>If the nums1 element is smaller than nums2 element, then increase the current index of nums1.</li>
			<li>If the nums1 element is greater than nums2 element, then increase the current index of nums2.</li>
			<li>And if both are equal, then add that element to the arraylist we made.
		</ol></li>
		<li>When we have got our output, then we just have to create an array of the same size as arraylist and push all the elements which are in the arraylist to the array and hence get our output array.</li>
	</ul>
</p>
