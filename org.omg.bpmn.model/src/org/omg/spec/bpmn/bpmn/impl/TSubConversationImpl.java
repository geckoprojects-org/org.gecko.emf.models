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

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.spec.bpmn.bpmn.BPMNPackage;
import org.omg.spec.bpmn.bpmn.TConversationNode;
import org.omg.spec.bpmn.bpmn.TSubConversation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TSub Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubConversationImpl#getConversationNodeGroup <em>Conversation Node Group</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.impl.TSubConversationImpl#getConversationNode <em>Conversation Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TSubConversationImpl extends TConversationNodeImpl implements TSubConversation {
	/**
	 * The cached value of the '{@link #getConversationNodeGroup() <em>Conversation Node Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConversationNodeGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap conversationNodeGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TSubConversationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BPMNPackage.eINSTANCE.getTSubConversation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getConversationNodeGroup() {
		if (conversationNodeGroup == null) {
			conversationNodeGroup = new BasicFeatureMap(this, BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP);
		}
		return conversationNodeGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TConversationNode> getConversationNode() {
		return getConversationNodeGroup().list(BPMNPackage.eINSTANCE.getTSubConversation_ConversationNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP:
				return ((InternalEList<?>)getConversationNodeGroup()).basicRemove(otherEnd, msgs);
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE:
				return ((InternalEList<?>)getConversationNode()).basicRemove(otherEnd, msgs);
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
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP:
				if (coreType) return getConversationNodeGroup();
				return ((FeatureMap.Internal)getConversationNodeGroup()).getWrapper();
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE:
				return getConversationNode();
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
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP:
				((FeatureMap.Internal)getConversationNodeGroup()).set(newValue);
				return;
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE:
				getConversationNode().clear();
				getConversationNode().addAll((Collection<? extends TConversationNode>)newValue);
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
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP:
				getConversationNodeGroup().clear();
				return;
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE:
				getConversationNode().clear();
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
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE_GROUP:
				return conversationNodeGroup != null && !conversationNodeGroup.isEmpty();
			case BPMNPackage.TSUB_CONVERSATION__CONVERSATION_NODE:
				return !getConversationNode().isEmpty();
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
		result.append(" (conversationNodeGroup: ");
		result.append(conversationNodeGroup);
		result.append(')');
		return result.toString();
	}

} //TSubConversationImpl
