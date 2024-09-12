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
import net.opengis.gml.CodeType;
import net.opengis.gml.GMLPackage;
import net.opengis.gml.IdentifierType;
import net.opengis.gml.OperationMethodType;
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
 * An implementation of the model object '<em><b>Operation Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getMethodID <em>Method ID</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getMethodFormula <em>Method Formula</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getSourceDimensions <em>Source Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getTargetDimensions <em>Target Dimensions</em>}</li>
 *   <li>{@link net.opengis.gml.impl.OperationMethodTypeImpl#getUsesParameter <em>Uses Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationMethodTypeImpl extends OperationMethodBaseTypeImpl implements OperationMethodType {
	/**
	 * The cached value of the '{@link #getMethodID() <em>Method ID</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodID()
	 * @generated
	 * @ordered
	 */
	protected EList<IdentifierType> methodID;

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
	 * The cached value of the '{@link #getMethodFormula() <em>Method Formula</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodFormula()
	 * @generated
	 * @ordered
	 */
	protected CodeType methodFormula;

	/**
	 * The default value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger SOURCE_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceDimensions() <em>Source Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger sourceDimensions = SOURCE_DIMENSIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TARGET_DIMENSIONS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDimensions() <em>Target Dimensions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDimensions()
	 * @generated
	 * @ordered
	 */
	protected BigInteger targetDimensions = TARGET_DIMENSIONS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUsesParameter() <em>Uses Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractGeneralOperationParameterRefType> usesParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getOperationMethodType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<IdentifierType> getMethodID() {
		if (methodID == null) {
			methodID = new EObjectContainmentEList<IdentifierType>(IdentifierType.class, this, GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID);
		}
		return methodID;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getMethodFormula() {
		return methodFormula;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodFormula(CodeType newMethodFormula, NotificationChain msgs) {
		CodeType oldMethodFormula = methodFormula;
		methodFormula = newMethodFormula;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA, oldMethodFormula, newMethodFormula);
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
	public void setMethodFormula(CodeType newMethodFormula) {
		if (newMethodFormula != methodFormula) {
			NotificationChain msgs = null;
			if (methodFormula != null)
				msgs = ((InternalEObject)methodFormula).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA, null, msgs);
			if (newMethodFormula != null)
				msgs = ((InternalEObject)newMethodFormula).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA, null, msgs);
			msgs = basicSetMethodFormula(newMethodFormula, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA, newMethodFormula, newMethodFormula));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getSourceDimensions() {
		return sourceDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceDimensions(BigInteger newSourceDimensions) {
		BigInteger oldSourceDimensions = sourceDimensions;
		sourceDimensions = newSourceDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS, oldSourceDimensions, sourceDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigInteger getTargetDimensions() {
		return targetDimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetDimensions(BigInteger newTargetDimensions) {
		BigInteger oldTargetDimensions = targetDimensions;
		targetDimensions = newTargetDimensions;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS, oldTargetDimensions, targetDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractGeneralOperationParameterRefType> getUsesParameter() {
		if (usesParameter == null) {
			usesParameter = new EObjectContainmentEList<AbstractGeneralOperationParameterRefType>(AbstractGeneralOperationParameterRefType.class, this, GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER);
		}
		return usesParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID:
				return ((InternalEList<?>)getMethodID()).basicRemove(otherEnd, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__REMARKS:
				return basicSetRemarks(null, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA:
				return basicSetMethodFormula(null, msgs);
			case GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER:
				return ((InternalEList<?>)getUsesParameter()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID:
				return getMethodID();
			case GMLPackage.OPERATION_METHOD_TYPE__REMARKS:
				return getRemarks();
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA:
				return getMethodFormula();
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				return getSourceDimensions();
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				return getTargetDimensions();
			case GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER:
				return getUsesParameter();
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
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID:
				getMethodID().clear();
				getMethodID().addAll((Collection<? extends IdentifierType>)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__REMARKS:
				setRemarks((StringOrRefType)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA:
				setMethodFormula((CodeType)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				setSourceDimensions((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				setTargetDimensions((BigInteger)newValue);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER:
				getUsesParameter().clear();
				getUsesParameter().addAll((Collection<? extends AbstractGeneralOperationParameterRefType>)newValue);
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
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID:
				getMethodID().clear();
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__REMARKS:
				setRemarks((StringOrRefType)null);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA:
				setMethodFormula((CodeType)null);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				setSourceDimensions(SOURCE_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				setTargetDimensions(TARGET_DIMENSIONS_EDEFAULT);
				return;
			case GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER:
				getUsesParameter().clear();
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
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_ID:
				return methodID != null && !methodID.isEmpty();
			case GMLPackage.OPERATION_METHOD_TYPE__REMARKS:
				return remarks != null;
			case GMLPackage.OPERATION_METHOD_TYPE__METHOD_FORMULA:
				return methodFormula != null;
			case GMLPackage.OPERATION_METHOD_TYPE__SOURCE_DIMENSIONS:
				return SOURCE_DIMENSIONS_EDEFAULT == null ? sourceDimensions != null : !SOURCE_DIMENSIONS_EDEFAULT.equals(sourceDimensions);
			case GMLPackage.OPERATION_METHOD_TYPE__TARGET_DIMENSIONS:
				return TARGET_DIMENSIONS_EDEFAULT == null ? targetDimensions != null : !TARGET_DIMENSIONS_EDEFAULT.equals(targetDimensions);
			case GMLPackage.OPERATION_METHOD_TYPE__USES_PARAMETER:
				return usesParameter != null && !usesParameter.isEmpty();
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
		result.append(" (sourceDimensions: ");
		result.append(sourceDimensions);
		result.append(", targetDimensions: ");
		result.append(targetDimensions);
		result.append(')');
		return result.toString();
	}

} //OperationMethodTypeImpl
