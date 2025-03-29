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
package org.omg.spec.bpmn.bpmn;

import javax.xml.namespace.QName;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TAssociation#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.bpmn.bpmn.TAssociation#getTargetRef <em>Target Ref</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTAssociation()
 * @model extendedMetaData="name='tAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TAssociation extends TArtifact {
	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.bpmn.bpmn.TAssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @see #isSetAssociationDirection()
	 * @see #unsetAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTAssociation_AssociationDirection()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='associationDirection'"
	 * @generated
	 */
	TAssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see org.omg.spec.bpmn.bpmn.TAssociationDirection
	 * @see #isSetAssociationDirection()
	 * @see #unsetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(TAssociationDirection value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @generated
	 */
	void unsetAssociationDirection();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.bpmn.bpmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Association Direction</em>' attribute is set.
	 * @see #unsetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @generated
	 */
	boolean isSetAssociationDirection();

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' attribute.
	 * @see #setSourceRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTAssociation_SourceRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='sourceRef'"
	 * @generated
	 */
	QName getSourceRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TAssociation#getSourceRef <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' attribute.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(QName value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' attribute.
	 * @see #setTargetRef(QName)
	 * @see org.omg.spec.bpmn.bpmn.BPMNPackage#getTAssociation_TargetRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='attribute' name='targetRef'"
	 * @generated
	 */
	QName getTargetRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.bpmn.bpmn.TAssociation#getTargetRef <em>Target Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' attribute.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(QName value);

} // TAssociation
