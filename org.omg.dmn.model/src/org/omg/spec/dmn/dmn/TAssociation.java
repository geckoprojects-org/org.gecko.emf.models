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
package org.omg.spec.dmn.dmn;

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
 *   <li>{@link org.omg.spec.dmn.dmn.TAssociation#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TAssociation#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection <em>Association Direction</em>}</li>
 * </ul>
 *
 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAssociation()
 * @model extendedMetaData="name='tAssociation' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TAssociation extends TArtifact {
	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' containment reference.
	 * @see #setSourceRef(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAssociation_SourceRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='sourceRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getSourceRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAssociation#getSourceRef <em>Source Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' containment reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(TDMNElementReference value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' containment reference.
	 * @see #setTargetRef(TDMNElementReference)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAssociation_TargetRef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='targetRef' namespace='##targetNamespace'"
	 * @generated
	 */
	TDMNElementReference getTargetRef();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAssociation#getTargetRef <em>Target Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' containment reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(TDMNElementReference value);

	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The default value is <code>"None"</code>.
	 * The literals are from the enumeration {@link org.omg.spec.dmn.dmn.TAssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @see #isSetAssociationDirection()
	 * @see #unsetAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @see org.omg.spec.dmn.dmn.DMNPackage#getTAssociation_AssociationDirection()
	 * @model default="None" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='associationDirection'"
	 * @generated
	 */
	TAssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see org.omg.spec.dmn.dmn.TAssociationDirection
	 * @see #isSetAssociationDirection()
	 * @see #unsetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(TAssociationDirection value);

	/**
	 * Unsets the value of the '{@link org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @generated
	 */
	void unsetAssociationDirection();

	/**
	 * Returns whether the value of the '{@link org.omg.spec.dmn.dmn.TAssociation#getAssociationDirection <em>Association Direction</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Association Direction</em>' attribute is set.
	 * @see #unsetAssociationDirection()
	 * @see #getAssociationDirection()
	 * @see #setAssociationDirection(TAssociationDirection)
	 * @generated
	 */
	boolean isSetAssociationDirection();

} // TAssociation
