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
package net.opengis.gml.gml.impl;

import java.math.BigInteger;

import java.util.Collection;

import net.opengis.gml.gml.AbstractGeneralOperationParameterPropertyType;
import net.opengis.gml.gml.GMLPackage;
import net.opengis.gml.gml.OperationParameterGroupType;

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
 * An implementation of the model object '<em><b>Operation Parameter Group Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.gml.impl.OperationParameterGroupTypeImpl#getMaximumOccurs <em>Maximum Occurs</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationParameterGroupTypeImpl#getParameterGroup <em>Parameter Group</em>}</li>
 *   <li>{@link net.opengis.gml.gml.impl.OperationParameterGroupTypeImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationParameterGroupTypeImpl extends AbstractGeneralOperationParameterTypeImpl implements OperationParameterGroupType {
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
	 * The cached value of the '{@link #getParameterGroup() <em>Parameter Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap parameterGroup;

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
	public FeatureMap getParameterGroup() {
		if (parameterGroup == null) {
			parameterGroup = new BasicFeatureMap(this, GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP);
		}
		return parameterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralOperationParameterPropertyType> getParameter() {
		return getParameterGroup().list(GMLPackage.eINSTANCE.getOperationParameterGroupType_Parameter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP:
				return ((InternalEList<?>)getParameterGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				return getMaximumOccurs();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP:
				if (coreType) return getParameterGroup();
				return ((FeatureMap.Internal)getParameterGroup()).getWrapper();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER:
				return getParameter();
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				setMaximumOccurs((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP:
				((FeatureMap.Internal)getParameterGroup()).set(newValue);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends AbstractGeneralOperationParameterPropertyType>)newValue);
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				setMaximumOccurs(MAXIMUM_OCCURS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP:
				getParameterGroup().clear();
				return;
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER:
				getParameter().clear();
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
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__MAXIMUM_OCCURS:
				return MAXIMUM_OCCURS_EDEFAULT == null ? maximumOccurs != null : !MAXIMUM_OCCURS_EDEFAULT.equals(maximumOccurs);
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER_GROUP:
				return parameterGroup != null && !parameterGroup.isEmpty();
			case GMLPackage.OPERATION_PARAMETER_GROUP_TYPE__PARAMETER:
				return !getParameter().isEmpty();
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
		result.append(", parameterGroup: ");
		result.append(parameterGroup);
		result.append(')');
		return result.toString();
	}

} //OperationParameterGroupTypeImpl
