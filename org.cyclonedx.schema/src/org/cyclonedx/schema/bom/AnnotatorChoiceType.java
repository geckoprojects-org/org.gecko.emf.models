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
package org.cyclonedx.schema.bom;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotator Choice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getOrganization <em>Organization</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getIndividual <em>Individual</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getComponent <em>Component</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getService <em>Service</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotatorChoiceType()
 * @model extendedMetaData="name='annotatorChoiceType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnnotatorChoiceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Organization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The organization that created the annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organization</em>' containment reference.
	 * @see #setOrganization(OrganizationalEntity)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotatorChoiceType_Organization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='organization' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalEntity getOrganization();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getOrganization <em>Organization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organization</em>' containment reference.
	 * @see #getOrganization()
	 * @generated
	 */
	void setOrganization(OrganizationalEntity value);

	/**
	 * Returns the value of the '<em><b>Individual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The person that created the annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individual</em>' containment reference.
	 * @see #setIndividual(OrganizationalContact)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotatorChoiceType_Individual()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='individual' namespace='##targetNamespace'"
	 * @generated
	 */
	OrganizationalContact getIndividual();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getIndividual <em>Individual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individual</em>' containment reference.
	 * @see #getIndividual()
	 * @generated
	 */
	void setIndividual(OrganizationalContact value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tool or component that created the annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(Component)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotatorChoiceType_Component()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace'"
	 * @generated
	 */
	Component getComponent();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The service that created the annotation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnnotatorChoiceType_Service()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace'"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnnotatorChoiceType#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // AnnotatorChoiceType
