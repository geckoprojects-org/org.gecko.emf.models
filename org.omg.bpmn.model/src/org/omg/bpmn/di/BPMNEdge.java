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
package org.omg.bpmn.di;

import org.omg.bpmn.bpmn2.BaseElement;

import org.omg.dd.di.DiagramElement;
import org.omg.dd.di.LabeledEdge;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.bpmn.di.BPMNEdge#getLabel <em>Label</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNEdge#getSourceElement <em>Source Element</em>}</li>
 *   <li>{@link org.omg.bpmn.di.BPMNEdge#getTargetElement <em>Target Element</em>}</li>
 * </ul>
 *
 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge()
 * @model extendedMetaData="name='BPMNEdge' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface BPMNEdge extends LabeledEdge {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(BPMNLabel)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge_Label()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="kind='element' name='BPMNLabel' namespace='http://www.omg.org/spec/BPMN/20100524/DI'"
	 * @generated
	 */
	BPMNLabel getLabel();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNEdge#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BPMNLabel value);

	/**
	 * Returns the value of the '<em><b>Bpmn Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bpmn Element</em>' reference.
	 * @see #setBpmnElement(BaseElement)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge_BpmnElement()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='bpmnElement'"
	 * @generated
	 */
	BaseElement getBpmnElement();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNEdge#getBpmnElement <em>Bpmn Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bpmn Element</em>' reference.
	 * @see #getBpmnElement()
	 * @generated
	 */
	void setBpmnElement(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Message Visible Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.bpmn.di.MessageVisibleKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Visible Kind</em>' attribute.
	 * @see org.omg.bpmn.di.MessageVisibleKind
	 * @see #setMessageVisibleKind(MessageVisibleKind)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge_MessageVisibleKind()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='messageVisibleKind'"
	 * @generated
	 */
	MessageVisibleKind getMessageVisibleKind();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNEdge#getMessageVisibleKind <em>Message Visible Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Visible Kind</em>' attribute.
	 * @see org.omg.bpmn.di.MessageVisibleKind
	 * @see #getMessageVisibleKind()
	 * @generated
	 */
	void setMessageVisibleKind(MessageVisibleKind value);

	/**
	 * Returns the value of the '<em><b>Source Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Element</em>' reference.
	 * @see #setSourceElement(DiagramElement)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge_SourceElement()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='sourceElement'"
	 * @generated
	 */
	DiagramElement getSourceElement();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNEdge#getSourceElement <em>Source Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Element</em>' reference.
	 * @see #getSourceElement()
	 * @generated
	 */
	void setSourceElement(DiagramElement value);

	/**
	 * Returns the value of the '<em><b>Target Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Element</em>' reference.
	 * @see #setTargetElement(DiagramElement)
	 * @see org.omg.bpmn.di.BpmnDiPackage#getBPMNEdge_TargetElement()
	 * @model ordered="false"
	 *        extendedMetaData="kind='attribute' name='targetElement'"
	 * @generated
	 */
	DiagramElement getTargetElement();

	/**
	 * Sets the value of the '{@link org.omg.bpmn.di.BPMNEdge#getTargetElement <em>Target Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Element</em>' reference.
	 * @see #getTargetElement()
	 * @generated
	 */
	void setTargetElement(DiagramElement value);

} // BPMNEdge
