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
package net.opengis.gml.impl;

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.gml.AbstractGeneralOperationParameterRefType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.OperationParameterGroupType;
import net.opengis.gml.StringOrRefType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Parameter Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.OperationParameterGroupTypeImpl#getGroupID <em>Group ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationParameterGroupTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationParameterGroupTypeImpl#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationParameterGroupTypeImpl#getIncludesParameter <em>Includes Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterGroupTypeImpl extends OperationParameterGroupBaseTypeImpl implements OperationParameterGroupType {
	/**
	 * The cached value of the '{@link #getGroupID() <em>Group ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> groupID;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected StringOrRefType remarks;

	/**
	 * The default value of the '{@link #getMaximumOccurs() <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOccurs()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger MAXIMUM_OCCURS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximumOccurs() <em>Maximum Occurs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumOccurs()
	 * @generated
	 * @ordered
	 */
	protected BigInteger maximumOccurs = MAXIMUM_OCCURS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncludesParameter() <em>Includes Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludesParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeneralOperationParameterRefType> includesParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationParameterGroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getOperationParameterGroupType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getGroupID() {
		if (groupID == null) {
			groupID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID);
		}
		return groupID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringOrRefType getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(StringOrRefType newRemarks, NotificationChain msgs) {
		StringOrRefType oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(StringOrRefType newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getMaximumOccurs() {
		return maximumOccurs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumOccurs(BigInteger newMaximumOccurs) {
		BigInteger oldMaximumOccurs = maximumOccurs;
		maximumOccurs = newMaximumOccurs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS, oldMaximumOccurs, maximumOccurs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralOperationParameterRefType> getIncludesParameter() {
		if (includesParameter == null) {
			includesParameter = new EObjectContainmentEList<AbstractGeneralOperationParameterRefType>(AbstractGeneralOperationParameterRefType.class, this, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER);
		}
		return includesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID:
				return ((InternalEList<?>)getGroupID()).basicRemove(otherEnd, msgs);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER:
				return ((InternalEList<?>)getIncludesParameter()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID:
				return getGroupID();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				return getMaximumOccurs();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER:
				return getIncludesParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID:
				getGroupID().clear();
				getGroupID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				setMaximumOccurs((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER:
				getIncludesParameter().clear();
				getIncludesParameter().addAll((Collection<? extends AbstractGeneralOperationParameterRefType>)newValue);
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID:
				getGroupID().clear();
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				setMaximumOccurs(MAXIMUM_OCCURS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER:
				getIncludesParameter().clear();
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__GROUP_ID:
				return groupID != null && !groupID.isEmpty();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				return MAXIMUM_OCCURS_EDEFAULT == null ? maximumOccurs != null : !MAXIMUM_OCCURS_EDEFAULT.equals(maximumOccurs);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__INCLUDES_PARAMETER:
				return includesParameter != null && !includesParameter.isEmpty();
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
		result.append(" (maximumOccurs: ");
		result.append(maximumOccurs);
		result.append(')');
		return result.toString();
	}

} //OperationParameterGroupTypeImpl
