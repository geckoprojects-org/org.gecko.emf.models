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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionnaire Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the questionnaire being responded to.
 * If the element is present, it must have either a @value, an @id, or extensions
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getBasedOn <em>Based On</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getPartOf <em>Part Of</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getStatus <em>Status</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getEncounter <em>Encounter</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getAuthored <em>Authored</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getSource <em>Source</em>}</li>
 *   <li>{@link org.hl7.fhir.QuestionnaireResponse#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse()
 * @model extendedMetaData="name='QuestionnaireResponse' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface QuestionnaireResponse extends DomainResource {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Identifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Business identifiers assigned to this questionnaire response by the performer and/or other systems.  These identifiers remain constant as the resource is updated and propagates from server to server.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifier</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Identifier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='identifier' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Identifier> getIdentifier();

	/**
	 * Returns the value of the '<em><b>Based On</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A plan, proposal or order that is fulfilled in whole or in part by this questionnaire response.  For example, a ServiceRequest seeking an intake assessment or a decision support recommendation to assess for post-partum depression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Based On</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_BasedOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basedOn' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getBasedOn();

	/**
	 * Returns the value of the '<em><b>Part Of</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Reference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A procedure or observation that this questionnaire was performed as part of the execution of.  For example, the surgery a checklist was executed as part of.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_PartOf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='partOf' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Reference> getPartOf();

	/**
	 * Returns the value of the '<em><b>Questionnaire</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Questionnaire that defines and organizes the questions for which answers are being provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Questionnaire</em>' containment reference.
	 * @see #setQuestionnaire(Canonical)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Questionnaire()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='questionnaire' namespace='##targetNamespace'"
	 * @generated
	 */
	Canonical getQuestionnaire();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getQuestionnaire <em>Questionnaire</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Questionnaire</em>' containment reference.
	 * @see #getQuestionnaire()
	 * @generated
	 */
	void setQuestionnaire(Canonical value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the questionnaire response.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(QuestionnaireResponseStatus)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Status()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='status' namespace='##targetNamespace'"
	 * @generated
	 */
	QuestionnaireResponseStatus getStatus();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(QuestionnaireResponseStatus value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject of the questionnaire response.  This could be a patient, organization, practitioner, device, etc.  This is who/what the answers apply to, but is not necessarily the source of information.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject</em>' containment reference.
	 * @see #setSubject(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Subject()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subject' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSubject();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getSubject <em>Subject</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' containment reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Reference value);

	/**
	 * Returns the value of the '<em><b>Encounter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Encounter during which this questionnaire response was created or to which the creation of this record is tightly associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encounter</em>' containment reference.
	 * @see #setEncounter(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Encounter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='encounter' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getEncounter();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getEncounter <em>Encounter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encounter</em>' containment reference.
	 * @see #getEncounter()
	 * @generated
	 */
	void setEncounter(Reference value);

	/**
	 * Returns the value of the '<em><b>Authored</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The date and/or time that this questionnaire response was last modified by the user - e.g. changing answers or revising status.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authored</em>' containment reference.
	 * @see #setAuthored(DateTime)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Authored()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authored' namespace='##targetNamespace'"
	 * @generated
	 */
	DateTime getAuthored();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getAuthored <em>Authored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authored</em>' containment reference.
	 * @see #getAuthored()
	 * @generated
	 */
	void setAuthored(DateTime value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or device that received the answers to the questions in the QuestionnaireResponse and recorded them in the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Author</em>' containment reference.
	 * @see #setAuthor(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getAuthor();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getAuthor <em>Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Author</em>' containment reference.
	 * @see #getAuthor()
	 * @generated
	 */
	void setAuthor(Reference value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The individual or device that answered the questions about the subject.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Source()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='source' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getSource();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.QuestionnaireResponse#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Reference value);

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.QuestionnaireResponseItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A group or question item from the original questionnaire for which answers are provided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getQuestionnaireResponse_Item()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='item' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<QuestionnaireResponseItem> getItem();

} // QuestionnaireResponse
