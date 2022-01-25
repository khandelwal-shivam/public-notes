# Note
A react component re-renders when 
    a. State is Updated
    b. Prop is Updated
    c. Parent Component is re-rendered(when state or prop of parent component are updated).
    
--------------------------------------------------------------------------------
Example Taken from https://www.youtube.com/watch?v=uojLJFt9SzY
# Memo Example
In Memo example we are seeing that if we update the parent number in parent component then the child component is needlessly updating even though the props of child component are same. This is certainly a needless re-rendering of Child Component.

To avoid this unnecessary re-rendering of child component we can use memo.

To Summarize 
If we want to re-render the component only when state or prop updates (not when parents prop or state updates) we use memo.

-----------------------------------------------------------------------------------

# Use CallBack Example

In this example despite adding memo, the child component is updating.

This is because we are passing a function (changeNumber) as props and child component will not be able to memoize (since we are passing a reference and reference changes every time for every re-render of parent component)

To solve this problem, we can use hook called useCallBack()

useCallBack takes 2 argument and return a memoized function.

This memoized function will maintain referential integrity, thus the child component will not be re-rendered.

------------------------------------------------------------------------------------

# Use Memo hook

Use useMemo (and useCallback) as an optimization technique to compute expensive operations in bigger applications. Use useMemo for big, expensive processing and useCallback to cache callbacks to prevent unnecessary component re-rending.
------------------------------------------------------------------------------------
# P.S.

Basically what we are trying to do is to limit the number of re-renders of child component

