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
 * A representation of the model object '<em><b>Care Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getPerformedActivity <em>Performed Activity</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getProgress <em>Progress</em>}</li>
 *   <li>{@link org.hl7.fhir.CarePlanActivity#getPlannedActivityReference <em>Planned Activity Reference</em>}</li>
 * </ul>
 *
 * @see org.hl7.fhir.FHIRPackage#getCarePlanActivity()
 * @model extendedMetaData="name='CarePlan.Activity' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface CarePlanActivity extends BackboneElement {
	/**
	 * Returns the value of the '<em><b>Performed Activity</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.CodeableReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies the activity that was performed. For example, an activity could be patient education, exercise, or a medication administration. The reference to an "event" resource, such as Procedure or Encounter or Observation, represents the activity that was performed. The requested activity can be conveyed using the CarePlan.activity.plannedActivityReference (a reference to a “request” resource).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Performed Activity</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getCarePlanActivity_PerformedActivity()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='performedActivity' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeableReference> getPerformedActivity();

	/**
	 * Returns the value of the '<em><b>Progress</b></em>' containment reference list.
	 * The list contents are of type {@link org.hl7.fhir.Annotation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Notes about the adherence/status/progress of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Progress</em>' containment reference list.
	 * @see org.hl7.fhir.FHIRPackage#getCarePlanActivity_Progress()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='progress' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Annotation> getProgress();

	/**
	 * Returns the value of the '<em><b>Planned Activity Reference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The details of the proposed activity represented in a specific resource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planned Activity Reference</em>' containment reference.
	 * @see #setPlannedActivityReference(Reference)
	 * @see org.hl7.fhir.FHIRPackage#getCarePlanActivity_PlannedActivityReference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='plannedActivityReference' namespace='##targetNamespace'"
	 * @generated
	 */
	Reference getPlannedActivityReference();

	/**
	 * Sets the value of the '{@link org.hl7.fhir.CarePlanActivity#getPlannedActivityReference <em>Planned Activity Reference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planned Activity Reference</em>' containment reference.
	 * @see #getPlannedActivityReference()
	 * @generated
	 */
	void setPlannedActivityReference(Reference value);

} // CarePlanActivity
