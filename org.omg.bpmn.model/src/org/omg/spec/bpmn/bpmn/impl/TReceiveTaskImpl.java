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

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.spec.bpmn.bpmn.BPMNFactory;
import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TReceiveTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TReceive Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TReceiveTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TReceiveTaskImpl extends TTaskImpl implements TReceiveTask {
	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final Object IMPLEMENTATION_EDEFAULT = BPMNFactory.eINSTANCE.createFromString(BPMNPackage.eINSTANCE.getTImplementation(), "##WebService");

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected Object implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * This is true if the Implementation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean implementationESet;

	/**
	 * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiate = INSTANTIATE_EDEFAULT;

	/**
	 * This is true if the Instantiate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean instantiateESet;

	/**
	 * The default value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName MESSAGE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageRef() <em>Message Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageRef()
	 * @generated
	 * @ordered
	 */
	protected QName messageRef = MESSAGE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName OPERATION_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationRef() <em>Operation Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationRef()
	 * @generated
	 * @ordered
	 */
	protected QName operationRef = OPERATION_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TReceiveTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTReceiveTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementation(Object newImplementation) {
		Object oldImplementation = implementation;
		implementation = newImplementation;
		boolean oldImplementationESet = implementationESet;
		implementationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION, oldImplementation, implementation, !oldImplementationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetImplementation() {
		Object oldImplementation = implementation;
		boolean oldImplementationESet = implementationESet;
		implementation = IMPLEMENTATION_EDEFAULT;
		implementationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION, oldImplementation, IMPLEMENTATION_EDEFAULT, oldImplementationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetImplementation() {
		return implementationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isInstantiate() {
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiate(boolean newInstantiate) {
		boolean oldInstantiate = instantiate;
		instantiate = newInstantiate;
		boolean oldInstantiateESet = instantiateESet;
		instantiateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TRECEIVE_TASK__INSTANTIATE, oldInstantiate, instantiate, !oldInstantiateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInstantiate() {
		boolean oldInstantiate = instantiate;
		boolean oldInstantiateESet = instantiateESet;
		instantiate = INSTANTIATE_EDEFAULT;
		instantiateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, BPMNPackage.TRECEIVE_TASK__INSTANTIATE, oldInstantiate, INSTANTIATE_EDEFAULT, oldInstantiateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInstantiate() {
		return instantiateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getMessageRef() {
		return messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessageRef(QName newMessageRef) {
		QName oldMessageRef = messageRef;
		messageRef = newMessageRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TRECEIVE_TASK__MESSAGE_REF, oldMessageRef, messageRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getOperationRef() {
		return operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperationRef(QName newOperationRef) {
		QName oldOperationRef = operationRef;
		operationRef = newOperationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TRECEIVE_TASK__OPERATION_REF, oldOperationRef, operationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION:
				return getImplementation();
			case BPMNPackage.TRECEIVE_TASK__INSTANTIATE:
				return isInstantiate();
			case BPMNPackage.TRECEIVE_TASK__MESSAGE_REF:
				return getMessageRef();
			case BPMNPackage.TRECEIVE_TASK__OPERATION_REF:
				return getOperationRef();
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
			case BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION:
				setImplementation(newValue);
				return;
			case BPMNPackage.TRECEIVE_TASK__INSTANTIATE:
				setInstantiate((Boolean)newValue);
				return;
			case BPMNPackage.TRECEIVE_TASK__MESSAGE_REF:
				setMessageRef((QName)newValue);
				return;
			case BPMNPackage.TRECEIVE_TASK__OPERATION_REF:
				setOperationRef((QName)newValue);
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
			case BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION:
				unsetImplementation();
				return;
			case BPMNPackage.TRECEIVE_TASK__INSTANTIATE:
				unsetInstantiate();
				return;
			case BPMNPackage.TRECEIVE_TASK__MESSAGE_REF:
				setMessageRef(MESSAGE_REF_EDEFAULT);
				return;
			case BPMNPackage.TRECEIVE_TASK__OPERATION_REF:
				setOperationRef(OPERATION_REF_EDEFAULT);
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
			case BPMNPackage.TRECEIVE_TASK__IMPLEMENTATION:
				return isSetImplementation();
			case BPMNPackage.TRECEIVE_TASK__INSTANTIATE:
				return isSetInstantiate();
			case BPMNPackage.TRECEIVE_TASK__MESSAGE_REF:
				return MESSAGE_REF_EDEFAULT == null ? messageRef != null : !MESSAGE_REF_EDEFAULT.equals(messageRef);
			case BPMNPackage.TRECEIVE_TASK__OPERATION_REF:
				return OPERATION_REF_EDEFAULT == null ? operationRef != null : !OPERATION_REF_EDEFAULT.equals(operationRef);
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
		result.append(" (implementation: ");
		if (implementationESet) result.append(implementation); else result.append("<unset>");
		result.append(", instantiate: ");
		if (instantiateESet) result.append(instantiate); else result.append("<unset>");
		result.append(", messageRef: ");
		result.append(messageRef);
		result.append(", operationRef: ");
		result.append(operationRef);
		result.append(')');
		return result.toString();
	}

} //TReceiveTaskImpl
