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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Analysis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                             An assessment of the impact and exploitability of the vulnerability.
 *                         
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getState <em>State</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getResponses <em>Responses</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getDetail <em>Detail</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getFirstIssued <em>First Issued</em>}</li>
 *   <li>{@link org.cyclonedx.schema.bom.AnalysisType#getLastUpdated <em>Last Updated</em>}</li>
 * </ul>
 *
 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType()
 * @model extendedMetaData="name='analysis_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AnalysisType extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ImpactAnalysisStateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Declares the current state of an occurrence of a vulnerability, after automated or manual analysis.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #setState(ImpactAnalysisStateType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_State()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='state' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpactAnalysisStateType getState();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisStateType
	 * @see #isSetState()
	 * @see #unsetState()
	 * @see #getState()
	 * @generated
	 */
	void setState(ImpactAnalysisStateType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetState()
	 * @see #getState()
	 * @see #setState(ImpactAnalysisStateType)
	 * @generated
	 */
	void unsetState();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getState <em>State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>State</em>' attribute is set.
	 * @see #unsetState()
	 * @see #getState()
	 * @see #setState(ImpactAnalysisStateType)
	 * @generated
	 */
	boolean isSetState();

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * The literals are from the enumeration {@link org.cyclonedx.schema.bom.ImpactAnalysisJustificationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The rationale of why the impact analysis state was asserted.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @see #isSetJustification()
	 * @see #unsetJustification()
	 * @see #setJustification(ImpactAnalysisJustificationType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_Justification()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='justification' namespace='##targetNamespace'"
	 * @generated
	 */
	ImpactAnalysisJustificationType getJustification();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see org.cyclonedx.schema.bom.ImpactAnalysisJustificationType
	 * @see #isSetJustification()
	 * @see #unsetJustification()
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(ImpactAnalysisJustificationType value);

	/**
	 * Unsets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetJustification()
	 * @see #getJustification()
	 * @see #setJustification(ImpactAnalysisJustificationType)
	 * @generated
	 */
	void unsetJustification();

	/**
	 * Returns whether the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getJustification <em>Justification</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Justification</em>' attribute is set.
	 * @see #unsetJustification()
	 * @see #getJustification()
	 * @see #setJustification(ImpactAnalysisJustificationType)
	 * @generated
	 */
	boolean isSetJustification();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A response to the vulnerability by the manufacturer, supplier, or
	 *                                     project responsible for the affected component or service. More than one response
	 *                                     is allowed. Responses are strongly encouraged for vulnerabilities where the analysis
	 *                                     state is exploitable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference.
	 * @see #setResponses(ResponsesType)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_Responses()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='responses' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsesType getResponses();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getResponses <em>Responses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responses</em>' containment reference.
	 * @see #getResponses()
	 * @generated
	 */
	void setResponses(ResponsesType value);

	/**
	 * Returns the value of the '<em><b>Detail</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     Detailed description of the impact including methods used during assessment.
	 *                                     If a vulnerability is not exploitable, this field should include specific details
	 *                                     on why the component or service is not impacted by this vulnerability.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Detail</em>' attribute.
	 * @see #setDetail(String)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_Detail()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='detail' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDetail();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getDetail <em>Detail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Detail</em>' attribute.
	 * @see #getDetail()
	 * @generated
	 */
	void setDetail(String value);

	/**
	 * Returns the value of the '<em><b>First Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the analysis was first issued.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Issued</em>' attribute.
	 * @see #setFirstIssued(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_FirstIssued()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='firstIssued' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getFirstIssued();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getFirstIssued <em>First Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Issued</em>' attribute.
	 * @see #getFirstIssued()
	 * @generated
	 */
	void setFirstIssued(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Last Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                     The date and time (timestamp) when the analysis was last updated.
	 *                                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Updated</em>' attribute.
	 * @see #setLastUpdated(XMLGregorianCalendar)
	 * @see org.cyclonedx.schema.bom.BOMPackage#getAnalysisType_LastUpdated()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime"
	 *        extendedMetaData="kind='element' name='lastUpdated' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLastUpdated();

	/**
	 * Sets the value of the '{@link org.cyclonedx.schema.bom.AnalysisType#getLastUpdated <em>Last Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Updated</em>' attribute.
	 * @see #getLastUpdated()
	 * @generated
	 */
	void setLastUpdated(XMLGregorianCalendar value);

} // AnalysisType
