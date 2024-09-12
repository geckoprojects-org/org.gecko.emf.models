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
package net.opengis.ows.impl;

import java.util.Collection;

import net.opengis.ows.DCPType;
import net.opengis.ows.DomainType;
import net.opengis.ows.MetadataType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.OperationType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.OperationTypeImpl#getDCP <em>DCP</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationTypeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationTypeImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationTypeImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationTypeImpl extends MinimalEObjectImpl.Container implements OperationType {
	/**
	 * The cached value of the '{@link #getDCP() <em>DCP</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDCP()
	 * @generated
	 * @ordered
	 */
	protected EList<DCPType> dCP;

	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainType> parameter;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainType> constraint;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<MetadataType> metadata;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.OPERATION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DCPType> getDCP() {
		if (dCP == null) {
			dCP = new EObjectContainmentEList<DCPType>(DCPType.class, this, OWSPackage.OPERATION_TYPE__DCP);
		}
		return dCP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<DomainType>(DomainType.class, this, OWSPackage.OPERATION_TYPE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainType> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<DomainType>(DomainType.class, this, OWSPackage.OPERATION_TYPE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MetadataType> getMetadata() {
		if (metadata == null) {
			metadata = new EObjectContainmentEList<MetadataType>(MetadataType.class, this, OWSPackage.OPERATION_TYPE__METADATA);
		}
		return metadata;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.OPERATION_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.OPERATION_TYPE__DCP:
				return ((InternalEList<?>)getDCP()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATION_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATION_TYPE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATION_TYPE__METADATA:
				return ((InternalEList<?>)getMetadata()).basicRemove(otherEnd, msgs);
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
			case OWSPackage.OPERATION_TYPE__DCP:
				return getDCP();
			case OWSPackage.OPERATION_TYPE__PARAMETER:
				return getParameter();
			case OWSPackage.OPERATION_TYPE__CONSTRAINT:
				return getConstraint();
			case OWSPackage.OPERATION_TYPE__METADATA:
				return getMetadata();
			case OWSPackage.OPERATION_TYPE__NAME:
				return getName();
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
			case OWSPackage.OPERATION_TYPE__DCP:
				getDCP().clear();
				getDCP().addAll((Collection<? extends DCPType>)newValue);
				return;
			case OWSPackage.OPERATION_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends DomainType>)newValue);
				return;
			case OWSPackage.OPERATION_TYPE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends DomainType>)newValue);
				return;
			case OWSPackage.OPERATION_TYPE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends MetadataType>)newValue);
				return;
			case OWSPackage.OPERATION_TYPE__NAME:
				setName((String)newValue);
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
			case OWSPackage.OPERATION_TYPE__DCP:
				getDCP().clear();
				return;
			case OWSPackage.OPERATION_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case OWSPackage.OPERATION_TYPE__CONSTRAINT:
				getConstraint().clear();
				return;
			case OWSPackage.OPERATION_TYPE__METADATA:
				getMetadata().clear();
				return;
			case OWSPackage.OPERATION_TYPE__NAME:
				setName(NAME_EDEFAULT);
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
			case OWSPackage.OPERATION_TYPE__DCP:
				return dCP != null && !dCP.isEmpty();
			case OWSPackage.OPERATION_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case OWSPackage.OPERATION_TYPE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case OWSPackage.OPERATION_TYPE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case OWSPackage.OPERATION_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //OperationTypeImpl
