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

import net.opengis.wfs.AllSomeType;
import net.opengis.wfs.LockFeatureType;
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
 * An implementation of the model object '<em><b>Lock Feature Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.wfs.impl.LockFeatureTypeImpl#getAbstractQueryExpressionGroup <em>Abstract Query Expression Group</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.LockFeatureTypeImpl#getAbstractQueryExpression <em>Abstract Query Expression</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.LockFeatureTypeImpl#getExpiry <em>Expiry</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.LockFeatureTypeImpl#getLockAction <em>Lock Action</em>}</li>
 *   <li>{@link net.opengis.wfs.impl.LockFeatureTypeImpl#getLockId <em>Lock Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LockFeatureTypeImpl extends BaseRequestTypeImpl implements LockFeatureType {
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
	 * The default value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger EXPIRY_EDEFAULT = new BigInteger("300");

	/**
	 * The cached value of the '{@link #getExpiry() <em>Expiry</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiry()
	 * @generated
	 * @ordered
	 */
	protected BigInteger expiry = EXPIRY_EDEFAULT;

	/**
	 * This is true if the Expiry attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean expiryESet;

	/**
	 * The default value of the '{@link #getLockAction() <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockAction()
	 * @generated
	 * @ordered
	 */
	protected static final AllSomeType LOCK_ACTION_EDEFAULT = AllSomeType.ALL;

	/**
	 * The cached value of the '{@link #getLockAction() <em>Lock Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockAction()
	 * @generated
	 * @ordered
	 */
	protected AllSomeType lockAction = LOCK_ACTION_EDEFAULT;

	/**
	 * This is true if the Lock Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean lockActionESet;

	/**
	 * The default value of the '{@link #getLockId() <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockId()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCK_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLockId() <em>Lock Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLockId()
	 * @generated
	 * @ordered
	 */
	protected String lockId = LOCK_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LockFeatureTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WFSPackage.Literals.LOCK_FEATURE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractQueryExpressionGroup() {
		if (abstractQueryExpressionGroup == null) {
			abstractQueryExpressionGroup = new BasicFeatureMap(this, WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP);
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
		return getAbstractQueryExpressionGroup().list(WFSPackage.Literals.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getExpiry() {
		return expiry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpiry(BigInteger newExpiry) {
		BigInteger oldExpiry = expiry;
		expiry = newExpiry;
		boolean oldExpiryESet = expiryESet;
		expiryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.LOCK_FEATURE_TYPE__EXPIRY, oldExpiry, expiry, !oldExpiryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetExpiry() {
		BigInteger oldExpiry = expiry;
		boolean oldExpiryESet = expiryESet;
		expiry = EXPIRY_EDEFAULT;
		expiryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.LOCK_FEATURE_TYPE__EXPIRY, oldExpiry, EXPIRY_EDEFAULT, oldExpiryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetExpiry() {
		return expiryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AllSomeType getLockAction() {
		return lockAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockAction(AllSomeType newLockAction) {
		AllSomeType oldLockAction = lockAction;
		lockAction = newLockAction == null ? LOCK_ACTION_EDEFAULT : newLockAction;
		boolean oldLockActionESet = lockActionESet;
		lockActionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION, oldLockAction, lockAction, !oldLockActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetLockAction() {
		AllSomeType oldLockAction = lockAction;
		boolean oldLockActionESet = lockActionESet;
		lockAction = LOCK_ACTION_EDEFAULT;
		lockActionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION, oldLockAction, LOCK_ACTION_EDEFAULT, oldLockActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetLockAction() {
		return lockActionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLockId() {
		return lockId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockId(String newLockId) {
		String oldLockId = lockId;
		lockId = newLockId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WFSPackage.LOCK_FEATURE_TYPE__LOCK_ID, oldLockId, lockId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				return ((InternalEList<?>)getAbstractQueryExpressionGroup()).basicRemove(otherEnd, msgs);
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
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
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				if (coreType) return getAbstractQueryExpressionGroup();
				return ((FeatureMap.Internal)getAbstractQueryExpressionGroup()).getWrapper();
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
				return getAbstractQueryExpression();
			case WFSPackage.LOCK_FEATURE_TYPE__EXPIRY:
				return getExpiry();
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION:
				return getLockAction();
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ID:
				return getLockId();
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
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				((FeatureMap.Internal)getAbstractQueryExpressionGroup()).set(newValue);
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__EXPIRY:
				setExpiry((BigInteger)newValue);
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION:
				setLockAction((AllSomeType)newValue);
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ID:
				setLockId((String)newValue);
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
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				getAbstractQueryExpressionGroup().clear();
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__EXPIRY:
				unsetExpiry();
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION:
				unsetLockAction();
				return;
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ID:
				setLockId(LOCK_ID_EDEFAULT);
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
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION_GROUP:
				return abstractQueryExpressionGroup != null && !abstractQueryExpressionGroup.isEmpty();
			case WFSPackage.LOCK_FEATURE_TYPE__ABSTRACT_QUERY_EXPRESSION:
				return !getAbstractQueryExpression().isEmpty();
			case WFSPackage.LOCK_FEATURE_TYPE__EXPIRY:
				return isSetExpiry();
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ACTION:
				return isSetLockAction();
			case WFSPackage.LOCK_FEATURE_TYPE__LOCK_ID:
				return LOCK_ID_EDEFAULT == null ? lockId != null : !LOCK_ID_EDEFAULT.equals(lockId);
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
		result.append(", expiry: ");
		if (expiryESet) result.append(expiry); else result.append("<unset>");
		result.append(", lockAction: ");
		if (lockActionESet) result.append(lockAction); else result.append("<unset>");
		result.append(", lockId: ");
		result.append(lockId);
		result.append(')');
		return result.toString();
	}

} //LockFeatureTypeImpl
