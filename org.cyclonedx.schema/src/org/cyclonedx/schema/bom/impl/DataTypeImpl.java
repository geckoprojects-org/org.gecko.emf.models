/*
 * Copyright (c) 2012 - 2025 Data In Motion and others.
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
package org.cyclonedx.schema.bom.impl;

import java.util.Collection;

import org.cyclonedx.schema.bom.BOMPackage;
import org.cyclonedx.schema.bom.ContentsType;
import org.cyclonedx.schema.bom.DataGovernance;
import org.cyclonedx.schema.bom.DataType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataTypeImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataTypeImpl#getClassification <em>Classification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataTypeImpl#getSensitiveData <em>Sensitive Data</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.impl.DataTypeImpl#getGovernance <em>Governance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypeImpl extends MinimalEObjectImpl.Container implements DataType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected ContentsType contents;

	/**
	 * The default value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassification() <em>Classification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassification()
	 * @generated
	 * @ordered
	 */
	protected String classification = CLASSIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSensitiveData() <em>Sensitive Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensitiveData()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> sensitiveData;

	/**
	 * The cached value of the '{@link #getGovernance() <em>Governance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGovernance()
	 * @generated
	 * @ordered
	 */
	protected DataGovernance governance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BOMPackage.eINSTANCE.getDataType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentsType getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContents(ContentsType newContents, NotificationChain msgs) {
		ContentsType oldContents = contents;
		contents = newContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__CONTENTS, oldContents, newContents);
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
	public void setContents(ContentsType newContents) {
		if (newContents != contents) {
			NotificationChain msgs = null;
			if (contents != null)
				msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_TYPE__CONTENTS, null, msgs);
			if (newContents != null)
				msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_TYPE__CONTENTS, null, msgs);
			msgs = basicSetContents(newContents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__CONTENTS, newContents, newContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassification() {
		return classification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassification(String newClassification) {
		String oldClassification = classification;
		classification = newClassification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__CLASSIFICATION, oldClassification, classification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EObject> getSensitiveData() {
		if (sensitiveData == null) {
			sensitiveData = new EObjectContainmentEList<EObject>(EObject.class, this, BOMPackage.DATA_TYPE__SENSITIVE_DATA);
		}
		return sensitiveData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataGovernance getGovernance() {
		return governance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGovernance(DataGovernance newGovernance, NotificationChain msgs) {
		DataGovernance oldGovernance = governance;
		governance = newGovernance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__GOVERNANCE, oldGovernance, newGovernance);
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
	public void setGovernance(DataGovernance newGovernance) {
		if (newGovernance != governance) {
			NotificationChain msgs = null;
			if (governance != null)
				msgs = ((InternalEObject)governance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_TYPE__GOVERNANCE, null, msgs);
			if (newGovernance != null)
				msgs = ((InternalEObject)newGovernance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BOMPackage.DATA_TYPE__GOVERNANCE, null, msgs);
			msgs = basicSetGovernance(newGovernance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BOMPackage.DATA_TYPE__GOVERNANCE, newGovernance, newGovernance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BOMPackage.DATA_TYPE__CONTENTS:
				return basicSetContents(null, msgs);
			case BOMPackage.DATA_TYPE__SENSITIVE_DATA:
				return ((InternalEList<?>)getSensitiveData()).basicRemove(otherEnd, msgs);
			case BOMPackage.DATA_TYPE__GOVERNANCE:
				return basicSetGovernance(null, msgs);
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
			case BOMPackage.DATA_TYPE__NAME:
				return getName();
			case BOMPackage.DATA_TYPE__CONTENTS:
				return getContents();
			case BOMPackage.DATA_TYPE__CLASSIFICATION:
				return getClassification();
			case BOMPackage.DATA_TYPE__SENSITIVE_DATA:
				return getSensitiveData();
			case BOMPackage.DATA_TYPE__GOVERNANCE:
				return getGovernance();
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
			case BOMPackage.DATA_TYPE__NAME:
				setName((String)newValue);
				return;
			case BOMPackage.DATA_TYPE__CONTENTS:
				setContents((ContentsType)newValue);
				return;
			case BOMPackage.DATA_TYPE__CLASSIFICATION:
				setClassification((String)newValue);
				return;
			case BOMPackage.DATA_TYPE__SENSITIVE_DATA:
				getSensitiveData().clear();
				getSensitiveData().addAll((Collection<? extends EObject>)newValue);
				return;
			case BOMPackage.DATA_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)newValue);
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
			case BOMPackage.DATA_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BOMPackage.DATA_TYPE__CONTENTS:
				setContents((ContentsType)null);
				return;
			case BOMPackage.DATA_TYPE__CLASSIFICATION:
				setClassification(CLASSIFICATION_EDEFAULT);
				return;
			case BOMPackage.DATA_TYPE__SENSITIVE_DATA:
				getSensitiveData().clear();
				return;
			case BOMPackage.DATA_TYPE__GOVERNANCE:
				setGovernance((DataGovernance)null);
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
			case BOMPackage.DATA_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BOMPackage.DATA_TYPE__CONTENTS:
				return contents != null;
			case BOMPackage.DATA_TYPE__CLASSIFICATION:
				return CLASSIFICATION_EDEFAULT == null ? classification != null : !CLASSIFICATION_EDEFAULT.equals(classification);
			case BOMPackage.DATA_TYPE__SENSITIVE_DATA:
				return sensitiveData != null && !sensitiveData.isEmpty();
			case BOMPackage.DATA_TYPE__GOVERNANCE:
				return governance != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", classification: ");
		result.append(classification);
		result.append(')');
		return result.toString();
	}

} //DataTypeImpl
