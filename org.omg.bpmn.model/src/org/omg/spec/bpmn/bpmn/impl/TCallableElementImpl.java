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
package org.omg.spec.bpmn.bpmn.impl;

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TCallableElement;
import org.omg.spec.bpmn.bpmn.TInputOutputBinding;
import org.omg.spec.bpmn.bpmn.TInputOutputSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TCallable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl#getSupportedInterfaceRef <em>Supported Interface Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TCallableElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TCallableElementImpl extends TRootElementImpl implements TCallableElement {
	/**
	 * The cached value of the '{@link #getSupportedInterfaceRef() <em>Supported Interface Ref</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedInterfaceRef()
	 * @generated
	 * @ordered
	 */
	protected EList<QName> supportedInterfaceRef;

	/**
	 * The cached value of the '{@link #getIoSpecification() <em>Io Specification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoSpecification()
	 * @generated
	 * @ordered
	 */
	protected TInputOutputSpecification ioSpecification;

	/**
	 * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TInputOutputBinding> ioBinding;

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
	protected TCallableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTCallableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<QName> getSupportedInterfaceRef() {
		if (supportedInterfaceRef == null) {
			supportedInterfaceRef = new EDataTypeEList<QName>(QName.class, this, BPMNPackage.TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF);
		}
		return supportedInterfaceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TInputOutputSpecification getIoSpecification() {
		return ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIoSpecification(TInputOutputSpecification newIoSpecification, NotificationChain msgs) {
		TInputOutputSpecification oldIoSpecification = ioSpecification;
		ioSpecification = newIoSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION, oldIoSpecification, newIoSpecification);
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
	public void setIoSpecification(TInputOutputSpecification newIoSpecification) {
		if (newIoSpecification != ioSpecification) {
			NotificationChain msgs = null;
			if (ioSpecification != null)
				msgs = ((InternalEObject)ioSpecification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs);
			if (newIoSpecification != null)
				msgs = ((InternalEObject)newIoSpecification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION, null, msgs);
			msgs = basicSetIoSpecification(newIoSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION, newIoSpecification, newIoSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TInputOutputBinding> getIoBinding() {
		if (ioBinding == null) {
			ioBinding = new EObjectContainmentEList<TInputOutputBinding>(TInputOutputBinding.class, this, BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING);
		}
		return ioBinding;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCALLABLE_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION:
				return basicSetIoSpecification(null, msgs);
			case BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING:
				return ((InternalEList<?>)getIoBinding()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
				return getSupportedInterfaceRef();
			case BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION:
				return getIoSpecification();
			case BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING:
				return getIoBinding();
			case BPMNPackage.TCALLABLE_ELEMENT__NAME:
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
			case BPMNPackage.TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
				getSupportedInterfaceRef().clear();
				getSupportedInterfaceRef().addAll((Collection<? extends QName>)newValue);
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)newValue);
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
				getIoBinding().addAll((Collection<? extends TInputOutputBinding>)newValue);
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__NAME:
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
			case BPMNPackage.TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
				getSupportedInterfaceRef().clear();
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((TInputOutputSpecification)null);
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
				return;
			case BPMNPackage.TCALLABLE_ELEMENT__NAME:
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
			case BPMNPackage.TCALLABLE_ELEMENT__SUPPORTED_INTERFACE_REF:
				return supportedInterfaceRef != null && !supportedInterfaceRef.isEmpty();
			case BPMNPackage.TCALLABLE_ELEMENT__IO_SPECIFICATION:
				return ioSpecification != null;
			case BPMNPackage.TCALLABLE_ELEMENT__IO_BINDING:
				return ioBinding != null && !ioBinding.isEmpty();
			case BPMNPackage.TCALLABLE_ELEMENT__NAME:
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
		result.append(" (supportedInterfaceRef: ");
		result.append(supportedInterfaceRef);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TCallableElementImpl
