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

import net.opengis.ows.DomainType;
import net.opengis.ows.OWSPackage;
import net.opengis.ows.OperationType;
import net.opengis.ows.OperationsMetadataType;

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
 * An implementation of the model object '<em><b>Operations Metadata Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.ows.impl.OperationsMetadataTypeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationsMetadataTypeImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationsMetadataTypeImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link net.opengis.ows.impl.OperationsMetadataTypeImpl#getExtendedCapabilities <em>Extended Capabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationsMetadataTypeImpl extends MinimalEObjectImpl.Container implements OperationsMetadataType {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationType> operation;

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
	 * The cached value of the '{@link #getExtendedCapabilities() <em>Extended Capabilities</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EObject extendedCapabilities;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationsMetadataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OWSPackage.Literals.OPERATIONS_METADATA_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationType> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<OperationType>(OperationType.class, this, OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DomainType> getParameter() {
		if (parameter == null) {
			parameter = new EObjectContainmentEList<DomainType>(DomainType.class, this, OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER);
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
			constraint = new EObjectContainmentEList<DomainType>(DomainType.class, this, OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getExtendedCapabilities() {
		return extendedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExtendedCapabilities(EObject newExtendedCapabilities, NotificationChain msgs) {
		EObject oldExtendedCapabilities = extendedCapabilities;
		extendedCapabilities = newExtendedCapabilities;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES, oldExtendedCapabilities, newExtendedCapabilities);
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
	public void setExtendedCapabilities(EObject newExtendedCapabilities) {
		if (newExtendedCapabilities != extendedCapabilities) {
			NotificationChain msgs = null;
			if (extendedCapabilities != null)
				msgs = ((InternalEObject)extendedCapabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES, null, msgs);
			if (newExtendedCapabilities != null)
				msgs = ((InternalEObject)newExtendedCapabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES, null, msgs);
			msgs = basicSetExtendedCapabilities(newExtendedCapabilities, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES, newExtendedCapabilities, newExtendedCapabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER:
				return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES:
				return basicSetExtendedCapabilities(null, msgs);
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
			case OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION:
				return getOperation();
			case OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER:
				return getParameter();
			case OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT:
				return getConstraint();
			case OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES:
				return getExtendedCapabilities();
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
			case OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends OperationType>)newValue);
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends DomainType>)newValue);
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends DomainType>)newValue);
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((EObject)newValue);
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
			case OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION:
				getOperation().clear();
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER:
				getParameter().clear();
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT:
				getConstraint().clear();
				return;
			case OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES:
				setExtendedCapabilities((EObject)null);
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
			case OWSPackage.OPERATIONS_METADATA_TYPE__OPERATION:
				return operation != null && !operation.isEmpty();
			case OWSPackage.OPERATIONS_METADATA_TYPE__PARAMETER:
				return parameter != null && !parameter.isEmpty();
			case OWSPackage.OPERATIONS_METADATA_TYPE__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case OWSPackage.OPERATIONS_METADATA_TYPE__EXTENDED_CAPABILITIES:
				return extendedCapabilities != null;
		}
		return super.eIsSet(featureID);
	}

} //OperationsMetadataTypeImpl
