/*
 * Copyright (c) 2012 - 2024 Data In Motion and others.
 * All rights reserved. 
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *      Mark Hoffmann - initial API and implementation
 */
package net.opengis.wfs.impl;

import java.math.BigInteger;

import net.opengis.fes.AbstractQueryExpressionType;

import net.opengis.wfs.GetFeatureType;
import net.opengis.wfs.ResolveValueType;
import net.opengis.wfs.ResultTypeType;
import net.opengis.wfs.WFSFactory;
import net.opengis.wfs.WFSPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getAbstractQueryExpression <em>Abstract Query Expression</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getCount <em>Count</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getOutputFormat <em>Output Format</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getResolve <em>Resolve</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getResolveDepth <em>Resolve Depth</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getResolveTimeout <em>Resolve Timeout</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getResultType <em>Result Type</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.GetFeatureTypeImpl#getStartIndex <em>Start Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetFeatureTypeImpl extends BaseRequestTypeImpl implements GetFeatureType {
	/**
	 * The cached value of the '{@link #getAbstractQueryExpressionGroup() <em>Abstract Query Expression Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractQueryExpressionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractQueryExpressionGroup;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected BigInteger count = COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FORMAT_EDEFAULT = "application/gml+xml; version=3.2";

	/**
	 * The cached value of the '{@link #getOutputFormat() <em>Output Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFormat()
	 * @generated
	 * @ordered
	 */
	protected String outputFormat = OUTPUT_FORMAT_EDEFAULT;

	/**
	 * This is true if the Output Format attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputFormatESet;

	/**
	 * The default value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected static final ResolveValueType RESOLVE_EDEFAULT = ResolveValueType.NONE;

	/**
	 * The cached value of the '{@link #getResolve() <em>Resolve</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolve()
	 * @generated
	 * @ordered
	 */
	protected ResolveValueType resolve = RESOLVE_EDEFAULT;

	/**
	 * This is true if the Resolve attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolveESet;

	/**
	 * The default value of the '{@link #getResolveDepth() <em>Resolve Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveDepth()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESOLVE_DEPTH_EDEFAULT = WFSFactory.eINSTANCE.createFromString(WFSPackage.eINSTANCE.getPositiveIntegerWithStar(), "*");

	/**
	 * The cached value of the '{@link #getResolveDepth() <em>Resolve Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveDepth()
	 * @generated
	 * @ordered
	 */
	protected Object resolveDepth = RESOLVE_DEPTH_EDEFAULT;

	/**
	 * This is true if the Resolve Depth attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolveDepthESet;

	/**
	 * The default value of the '{@link #getResolveTimeout() <em>Resolve Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger RESOLVE_TIMEOUT_EDEFAULT = new BigInteger("300");

	/**
	 * The cached value of the '{@link #getResolveTimeout() <em>Resolve Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolveTimeout()
	 * @generated
	 * @ordered
	 */
	protected BigInteger resolveTimeout = RESOLVE_TIMEOUT_EDEFAULT;

	/**
	 * This is true if the Resolve Timeout attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resolveTimeoutESet;

	/**
	 * The default value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected static final ResultTypeType RESULT_TYPE_EDEFAULT = ResultTypeType.RESULTS;

	/**
	 * The cached value of the '{@link #getResultType() <em>Result Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultType()
	 * @generated
	 * @ordered
	 */
	protected ResultTypeType resultType = RESULT_TYPE_EDEFAULT;

	/**
	 * This is true if the Result Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean resultTypeESet;

	/**
	 * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger START_INDEX_EDEFAULT = new BigInteger("0");

	/**
	 * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartIndex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger startIndex = START_INDEX_EDEFAULT;

	/**
	 * This is true if the Start Index attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean startIndexESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GetFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.GET_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractQueryExpressionGroup() {
		if (abstractQueryExpressionGroup == null) {
			abstractQueryExpressionGroup = new BasicFeatureMap(this, WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP);
		}
		return abstractQueryExpressionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractQueryExpressionType> getAbstractQueryExpression() {
		return getAbstractQueryExpressionGroup().list(WFSPackage.Literals.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCount(BigInteger newCount) {
		BigInteger oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOutputFormat() {
		return outputFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputFormat(String newOutputFormat) {
		String oldOutputFormat = outputFormat;
		outputFormat = newOutputFormat;
		boolean oldOutputFormatESet = outputFormatESet;
		outputFormatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT, oldOutputFormat, outputFormat, !oldOutputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOutputFormat() {
		String oldOutputFormat = outputFormat;
		boolean oldOutputFormatESet = outputFormatESet;
		outputFormat = OUTPUT_FORMAT_EDEFAULT;
		outputFormatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT, oldOutputFormat, OUTPUT_FORMAT_EDEFAULT, oldOutputFormatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOutputFormat() {
		return outputFormatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolveValueType getResolve() {
		return resolve;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolve(ResolveValueType newResolve) {
		ResolveValueType oldResolve = resolve;
		resolve = newResolve == null ? RESOLVE_EDEFAULT : newResolve;
		boolean oldResolveESet = resolveESet;
		resolveESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__RESOLVE, oldResolve, resolve, !oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResolve() {
		ResolveValueType oldResolve = resolve;
		boolean oldResolveESet = resolveESet;
		resolve = RESOLVE_EDEFAULT;
		resolveESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__RESOLVE, oldResolve, RESOLVE_EDEFAULT, oldResolveESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResolve() {
		return resolveESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getResolveDepth() {
		return resolveDepth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolveDepth(Object newResolveDepth) {
		Object oldResolveDepth = resolveDepth;
		resolveDepth = newResolveDepth;
		boolean oldResolveDepthESet = resolveDepthESet;
		resolveDepthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH, oldResolveDepth, resolveDepth, !oldResolveDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResolveDepth() {
		Object oldResolveDepth = resolveDepth;
		boolean oldResolveDepthESet = resolveDepthESet;
		resolveDepth = RESOLVE_DEPTH_EDEFAULT;
		resolveDepthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH, oldResolveDepth, RESOLVE_DEPTH_EDEFAULT, oldResolveDepthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResolveDepth() {
		return resolveDepthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getResolveTimeout() {
		return resolveTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolveTimeout(BigInteger newResolveTimeout) {
		BigInteger oldResolveTimeout = resolveTimeout;
		resolveTimeout = newResolveTimeout;
		boolean oldResolveTimeoutESet = resolveTimeoutESet;
		resolveTimeoutESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT, oldResolveTimeout, resolveTimeout, !oldResolveTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResolveTimeout() {
		BigInteger oldResolveTimeout = resolveTimeout;
		boolean oldResolveTimeoutESet = resolveTimeoutESet;
		resolveTimeout = RESOLVE_TIMEOUT_EDEFAULT;
		resolveTimeoutESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT, oldResolveTimeout, RESOLVE_TIMEOUT_EDEFAULT, oldResolveTimeoutESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResolveTimeout() {
		return resolveTimeoutESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultTypeType getResultType() {
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultType(ResultTypeType newResultType) {
		ResultTypeType oldResultType = resultType;
		resultType = newResultType == null ? RESULT_TYPE_EDEFAULT : newResultType;
		boolean oldResultTypeESet = resultTypeESet;
		resultTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE, oldResultType, resultType, !oldResultTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetResultType() {
		ResultTypeType oldResultType = resultType;
		boolean oldResultTypeESet = resultTypeESet;
		resultType = RESULT_TYPE_EDEFAULT;
		resultTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE, oldResultType, RESULT_TYPE_EDEFAULT, oldResultTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetResultType() {
		return resultTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getStartIndex() {
		return startIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartIndex(BigInteger newStartIndex) {
		BigInteger oldStartIndex = startIndex;
		startIndex = newStartIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.GET_FEATURE_TYPE__START_INDEX, oldStartIndex, startIndex, !oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetStartIndex() {
		BigInteger oldStartIndex = startIndex;
		boolean oldStartIndexESet = startIndexESet;
		startIndex = START_INDEX_EDEFAULT;
		startIndexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.GET_FEATURE_TYPE__START_INDEX, oldStartIndex, START_INDEX_EDEFAULT, oldStartIndexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetStartIndex() {
		return startIndexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				return ((InternalEList<?>)getAbstractQueryExpressionGroup()).basicRemove(otherEnd, msgs);
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
				return ((InternalEList<?>)getAbstractQueryExpression()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				if (coreType) return getAbstractQueryExpressionGroup();
				return ((FeatureMap.Internal)getAbstractQueryExpressionGroup()).getWrapper();
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
				return getAbstractQueryExpression();
			case WFSPackage.GET_FEATURE_TYPE__COUNT:
				return getCount();
			case WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT:
				return getOutputFormat();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE:
				return getResolve();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH:
				return getResolveDepth();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT:
				return getResolveTimeout();
			case WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE:
				return getResultType();
			case WFSPackage.GET_FEATURE_TYPE__START_INDEX:
				return getStartIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				((FeatureMap.Internal)getAbstractQueryExpressionGroup()).set(newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__COUNT:
				setCount((BigInteger)newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT:
				setOutputFormat((String)newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE:
				setResolve((ResolveValueType)newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH:
				setResolveDepth(newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT:
				setResolveTimeout((BigInteger)newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE:
				setResultType((ResultTypeType)newValue);
				return;
			case WFSPackage.GET_FEATURE_TYPE__START_INDEX:
				setStartIndex((BigInteger)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				getAbstractQueryExpressionGroup().clear();
				return;
			case WFSPackage.GET_FEATURE_TYPE__COUNT:
				setCount(COUNT_EDEFAULT);
				return;
			case WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT:
				unsetOutputFormat();
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE:
				unsetResolve();
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH:
				unsetResolveDepth();
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT:
				unsetResolveTimeout();
				return;
			case WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE:
				unsetResultType();
				return;
			case WFSPackage.GET_FEATURE_TYPE__START_INDEX:
				unsetStartIndex();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				return abstractQueryExpressionGroup != null && !abstractQueryExpressionGroup.isEmpty();
			case WFSPackage.GET_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
				return !getAbstractQueryExpression().isEmpty();
			case WFSPackage.GET_FEATURE_TYPE__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
			case WFSPackage.GET_FEATURE_TYPE__OUTPUT_FORMAT:
				return isSetOutputFormat();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE:
				return isSetResolve();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_DEPTH:
				return isSetResolveDepth();
			case WFSPackage.GET_FEATURE_TYPE__RESOLVE_TIMEOUT:
				return isSetResolveTimeout();
			case WFSPackage.GET_FEATURE_TYPE__RESULT_TYPE:
				return isSetResultType();
			case WFSPackage.GET_FEATURE_TYPE__START_INDEX:
				return isSetStartIndex();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (abstractQueryExpressionGroup: ");
		result.append(abstractQueryExpressionGroup);
		result.append(", count: ");
		result.append(count);
		result.append(", outputFormat: ");
		if (outputFormatESet) result.append(outputFormat); else result.append("<unset>");
		result.append(", resolve: ");
		if (resolveESet) result.append(resolve); else result.append("<unset>");
		result.append(", resolveDepth: ");
		if (resolveDepthESet) result.append(resolveDepth); else result.append("<unset>");
		result.append(", resolveTimeout: ");
		if (resolveTimeoutESet) result.append(resolveTimeout); else result.append("<unset>");
		result.append(", resultType: ");
		if (resultTypeESet) result.append(resultType); else result.append("<unset>");
		result.append(", startIndex: ");
		if (startIndexESet) result.append(startIndex); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GetFeatureTypeImpl
