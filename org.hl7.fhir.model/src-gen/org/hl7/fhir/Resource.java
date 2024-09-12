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
package org.hl7.fhir;

import java.lang.String;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the base resource type for everything.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.Resource#getId <em>Id</em>}</li>
 *   <li>{@link org.hl7.fhir.Resource#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.hl7.fhir.Resource#getImplicitRules <em>Implicit Rules</em>}</li>
 *   <li>{@link org.hl7.fhir.Resource#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.hl7.fhir.Resource#getExtId <em>Ext Id</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getResource()
 * @model extendedMetaData="name='Resource' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface Resource extends Base {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Id)
	 * @see org.hl7.fhir.FHIRPackage#getResource_Id()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	Id getId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Resource#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Id value);

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content might not always be associated with version changes to the resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meta</em>' containment reference.
	 * @see #setMeta(Meta)
	 * @see org.hl7.fhir.FHIRPackage#getResource_Meta()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='meta' namespace='##targetNamespace'"
	 * @generated
	 */
	Meta getMeta();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Resource#getMeta <em>Meta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' containment reference.
	 * @see #getMeta()
	 * @generated
	 */
	void setMeta(Meta value);

	/**
	 * Returns the value of the '<em><b>Implicit Rules</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content. Often, this is a reference to an implementation guide that defines the special rules along with other profiles etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implicit Rules</em>' containment reference.
	 * @see #setImplicitRules(Uri)
	 * @see org.hl7.fhir.FHIRPackage#getResource_ImplicitRules()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='implicitRules' namespace='##targetNamespace'"
	 * @generated
	 */
	Uri getImplicitRules();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Resource#getImplicitRules <em>Implicit Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implicit Rules</em>' containment reference.
	 * @see #getImplicitRules()
	 * @generated
	 */
	void setImplicitRules(Uri value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The base language in which the resource is written.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' containment reference.
	 * @see #setLanguage(Code)
	 * @see org.hl7.fhir.FHIRPackage#getResource_Language()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='language' namespace='##targetNamespace'"
	 * @generated
	 */
	Code getLanguage();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Resource#getLanguage <em>Language</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' containment reference.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(Code value);

	/**
	 * Returns the value of the '<em><b>Ext Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ext Id</em>' attribute.
	 * @see #setExtId(String)
	 * @see org.hl7.fhir.FHIRPackage#getResource_ExtId()
	 * @model id="true"
	 * @generated
	 */
	String getExtId();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.Resource#getExtId <em>Ext Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Id</em>' attribute.
	 * @see #getExtId()
	 * @generated
	 */
	void setExtId(String value);

} // Resource
