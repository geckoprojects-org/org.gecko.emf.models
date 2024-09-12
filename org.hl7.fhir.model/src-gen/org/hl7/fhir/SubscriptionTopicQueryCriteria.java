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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subscription Topic Query Criteria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes a stream of resource state changes or events and annotated with labels useful to filter projections from this topic.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getPrevious <em>Previous</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getResultForCreate <em>Result For Create</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getCurrent <em>Current</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getResultForDelete <em>Result For Delete</em>}</li>
 *   <li>{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getRequireBoth <em>Require Both</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria()
 * @model extendedMetaData="name='SubscriptionTopic.QueryCriteria' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SubscriptionTopicQueryCriteria extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Previous</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FHIR query based rules are applied to the previous resource state (e.g., state before an update).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Previous</em>' containment reference.
	 * @see #setPrevious(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria_Previous()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='previous' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getPrevious();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getPrevious <em>Previous</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous</em>' containment reference.
	 * @see #getPrevious()
	 * @generated
	 */
	void setPrevious(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Result For Create</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For `create` interactions, should the `previous` criteria count as an automatic pass or an automatic fail. If not present, the testing behavior during `create` interactions is unspecified (server discretion).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result For Create</em>' containment reference.
	 * @see #setResultForCreate(CriteriaNotExistsBehavior)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria_ResultForCreate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultForCreate' namespace='##targetNamespace'"
	 * @generated
	 */
	CriteriaNotExistsBehavior getResultForCreate();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getResultForCreate <em>Result For Create</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result For Create</em>' containment reference.
	 * @see #getResultForCreate()
	 * @generated
	 */
	void setResultForCreate(CriteriaNotExistsBehavior value);

	/**
	 * Returns the value of the '<em><b>Current</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The FHIR query based rules are applied to the current resource state (e.g., state after an update).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current</em>' containment reference.
	 * @see #setCurrent(org.hl7.fhir.String)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria_Current()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='current' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.String getCurrent();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getCurrent <em>Current</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current</em>' containment reference.
	 * @see #getCurrent()
	 * @generated
	 */
	void setCurrent(org.hl7.fhir.String value);

	/**
	 * Returns the value of the '<em><b>Result For Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For 'delete' interactions, should the 'current' query criteria count as an automatic pass or an automatic fail. If not present, the testing behavior during `delete` interactions is unspecified (server discretion).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result For Delete</em>' containment reference.
	 * @see #setResultForDelete(CriteriaNotExistsBehavior)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria_ResultForDelete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resultForDelete' namespace='##targetNamespace'"
	 * @generated
	 */
	CriteriaNotExistsBehavior getResultForDelete();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getResultForDelete <em>Result For Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result For Delete</em>' containment reference.
	 * @see #getResultForDelete()
	 * @generated
	 */
	void setResultForDelete(CriteriaNotExistsBehavior value);

	/**
	 * Returns the value of the '<em><b>Require Both</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If set to `true`, both the `current` and `previous` query criteria must evaluate `true` to trigger a notification for this topic.  If set to `false` or not present, a notification for this topic will be triggered if either the `current` or `previous` tests evaluate to `true`.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Require Both</em>' containment reference.
	 * @see #setRequireBoth(org.hl7.fhir.Boolean)
	 * @see org.hl7.fhir.FHIRPackage#getSubscriptionTopicQueryCriteria_RequireBoth()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requireBoth' namespace='##targetNamespace'"
	 * @generated
	 */
	org.hl7.fhir.Boolean getRequireBoth();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.SubscriptionTopicQueryCriteria#getRequireBoth <em>Require Both</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Both</em>' containment reference.
	 * @see #getRequireBoth()
	 * @generated
	 */
	void setRequireBoth(org.hl7.fhir.Boolean value);

} // SubscriptionTopicQueryCriteria
