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
package org.omg.bpmn.bpmn2.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.omg.bpmn.bpmn2.Bpmn2Package;
import org.omg.bpmn.bpmn2.ConversationLink;
import org.omg.bpmn.bpmn2.InteractionNode;
import org.omg.bpmn.bpmn2.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.bpmn2.impl.TaskImpl#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 *   <li>{@link org.omg.bpmn.bpmn2.impl.TaskImpl#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends ActivityImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bpmn2Package.eINSTANCE.getTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConversationLink> getIncomingConversationLinks() {
		// TODO: implement this method to return the 'Incoming Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConversationLink> getOutgoingConversationLinks() {
		// TODO: implement this method to return the 'Outgoing Conversation Links' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bpmn2Package.TASK__INCOMING_CONVERSATION_LINKS:
				return getIncomingConversationLinks();
			case Bpmn2Package.TASK__OUTGOING_CONVERSATION_LINKS:
				return getOutgoingConversationLinks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bpmn2Package.TASK__INCOMING_CONVERSATION_LINKS:
				return !getIncomingConversationLinks().isEmpty();
			case Bpmn2Package.TASK__OUTGOING_CONVERSATION_LINKS:
				return !getOutgoingConversationLinks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (derivedFeatureID) {
				case Bpmn2Package.TASK__INCOMING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS;
				case Bpmn2Package.TASK__OUTGOING_CONVERSATION_LINKS: return Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == InteractionNode.class) {
			switch (baseFeatureID) {
				case Bpmn2Package.INTERACTION_NODE__INCOMING_CONVERSATION_LINKS: return Bpmn2Package.TASK__INCOMING_CONVERSATION_LINKS;
				case Bpmn2Package.INTERACTION_NODE__OUTGOING_CONVERSATION_LINKS: return Bpmn2Package.TASK__OUTGOING_CONVERSATION_LINKS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TaskImpl
