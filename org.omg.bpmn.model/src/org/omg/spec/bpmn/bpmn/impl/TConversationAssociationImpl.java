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
import org.omg.spec.bpmn.bpmn.TConversationAssociation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TConversation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TConversationAssociationImpl#getInnerConversationNodeRef <em>Inner Conversation Node Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TConversationAssociationImpl#getOuterConversationNodeRef <em>Outer Conversation Node Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TConversationAssociationImpl extends TBaseElementImpl implements TConversationAssociation {
	/**
	 * The default value of the '{@link #getInnerConversationNodeRef() <em>Inner Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName INNER_CONVERSATION_NODE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInnerConversationNodeRef() <em>Inner Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInnerConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected QName innerConversationNodeRef = INNER_CONVERSATION_NODE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getOuterConversationNodeRef() <em>Outer Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected static final QName OUTER_CONVERSATION_NODE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOuterConversationNodeRef() <em>Outer Conversation Node Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOuterConversationNodeRef()
	 * @generated
	 * @ordered
	 */
	protected QName outerConversationNodeRef = OUTER_CONVERSATION_NODE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TConversationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTConversationAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getInnerConversationNodeRef() {
		return innerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInnerConversationNodeRef(QName newInnerConversationNodeRef) {
		QName oldInnerConversationNodeRef = innerConversationNodeRef;
		innerConversationNodeRef = newInnerConversationNodeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF, oldInnerConversationNodeRef, innerConversationNodeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QName getOuterConversationNodeRef() {
		return outerConversationNodeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOuterConversationNodeRef(QName newOuterConversationNodeRef) {
		QName oldOuterConversationNodeRef = outerConversationNodeRef;
		outerConversationNodeRef = newOuterConversationNodeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BPMNPackage.TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF, oldOuterConversationNodeRef, outerConversationNodeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BPMNPackage.TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				return getInnerConversationNodeRef();
			case BPMNPackage.TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				return getOuterConversationNodeRef();
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
			case BPMNPackage.TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				setInnerConversationNodeRef((QName)newValue);
				return;
			case BPMNPackage.TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				setOuterConversationNodeRef((QName)newValue);
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
			case BPMNPackage.TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				setInnerConversationNodeRef(INNER_CONVERSATION_NODE_REF_EDEFAULT);
				return;
			case BPMNPackage.TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				setOuterConversationNodeRef(OUTER_CONVERSATION_NODE_REF_EDEFAULT);
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
			case BPMNPackage.TCONVERSATION_ASSOCIATION__INNER_CONVERSATION_NODE_REF:
				return INNER_CONVERSATION_NODE_REF_EDEFAULT == null ? innerConversationNodeRef != null : !INNER_CONVERSATION_NODE_REF_EDEFAULT.equals(innerConversationNodeRef);
			case BPMNPackage.TCONVERSATION_ASSOCIATION__OUTER_CONVERSATION_NODE_REF:
				return OUTER_CONVERSATION_NODE_REF_EDEFAULT == null ? outerConversationNodeRef != null : !OUTER_CONVERSATION_NODE_REF_EDEFAULT.equals(outerConversationNodeRef);
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
		result.append(" (innerConversationNodeRef: ");
		result.append(innerConversationNodeRef);
		result.append(", outerConversationNodeRef: ");
		result.append(outerConversationNodeRef);
		result.append(')');
		return result.toString();
	}

} //TConversationAssociationImpl
