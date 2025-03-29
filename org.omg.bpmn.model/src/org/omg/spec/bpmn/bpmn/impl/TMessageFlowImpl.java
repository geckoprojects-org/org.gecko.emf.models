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

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TMessageFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TMessage Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TMessageFlowImpl#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TMessageFlowImpl extends TBaseElementImpl implements TMessageFlow {
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
	 * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName SOURCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected QName sourceRef = SOURCE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName TARGET_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRef() <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRef()
	 * @generated
	 * @ordered
	 */
	protected QName targetRef = TARGET_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TMessageFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTMessageFlow();
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMESSAGE_FLOW__MESSAGE_REF, oldMessageRef, messageRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMESSAGE_FLOW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRef(QName newSourceRef) {
		QName oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMESSAGE_FLOW__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getTargetRef() {
		return targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRef(QName newTargetRef) {
		QName oldTargetRef = targetRef;
		targetRef = newTargetRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TMESSAGE_FLOW__TARGET_REF, oldTargetRef, targetRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TMESSAGE_FLOW__MESSAGE_REF:
				return getMessageRef();
			case BPMNPackage.TMESSAGE_FLOW__NAME:
				return getName();
			case BPMNPackage.TMESSAGE_FLOW__SOURCE_REF:
				return getSourceRef();
			case BPMNPackage.TMESSAGE_FLOW__TARGET_REF:
				return getTargetRef();
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
			case BPMNPackage.TMESSAGE_FLOW__MESSAGE_REF:
				setMessageRef((QName)newValue);
				return;
			case BPMNPackage.TMESSAGE_FLOW__NAME:
				setName((String)newValue);
				return;
			case BPMNPackage.TMESSAGE_FLOW__SOURCE_REF:
				setSourceRef((QName)newValue);
				return;
			case BPMNPackage.TMESSAGE_FLOW__TARGET_REF:
				setTargetRef((QName)newValue);
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
			case BPMNPackage.TMESSAGE_FLOW__MESSAGE_REF:
				setMessageRef(MESSAGE_REF_EDEFAULT);
				return;
			case BPMNPackage.TMESSAGE_FLOW__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BPMNPackage.TMESSAGE_FLOW__SOURCE_REF:
				setSourceRef(SOURCE_REF_EDEFAULT);
				return;
			case BPMNPackage.TMESSAGE_FLOW__TARGET_REF:
				setTargetRef(TARGET_REF_EDEFAULT);
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
			case BPMNPackage.TMESSAGE_FLOW__MESSAGE_REF:
				return MESSAGE_REF_EDEFAULT == null ? messageRef != null : !MESSAGE_REF_EDEFAULT.equals(messageRef);
			case BPMNPackage.TMESSAGE_FLOW__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case BPMNPackage.TMESSAGE_FLOW__SOURCE_REF:
				return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
			case BPMNPackage.TMESSAGE_FLOW__TARGET_REF:
				return TARGET_REF_EDEFAULT == null ? targetRef != null : !TARGET_REF_EDEFAULT.equals(targetRef);
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
		result.append(" (messageRef: ");
		result.append(messageRef);
		result.append(", name: ");
		result.append(name);
		result.append(", sourceRef: ");
		result.append(sourceRef);
		result.append(", targetRef: ");
		result.append(targetRef);
		result.append(')');
		return result.toString();
	}

} //TMessageFlowImpl
