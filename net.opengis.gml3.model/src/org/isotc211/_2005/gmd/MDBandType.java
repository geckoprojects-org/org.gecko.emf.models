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
package org.isotc211._2005.gmd;

import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gco.UomLengthPropertyType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Band Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getMaxValue <em>Max Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getUnits <em>Units</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getPeakResponse <em>Peak Response</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getBitsPerValue <em>Bits Per Value</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getToneGradation <em>Tone Gradation</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getScaleFactor <em>Scale Factor</em>}</li>
 *   <li>{@link org.isotc211._2005.gmd.MDBandType#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType()
 * @model extendedMetaData="name='MD_Band_Type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MDBandType extends MDRangeDimensionType {
	/**
	 * Returns the value of the '<em><b>Max Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Value</em>' containment reference.
	 * @see #setMaxValue(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_MaxValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='maxValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getMaxValue();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getMaxValue <em>Max Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Value</em>' containment reference.
	 * @see #getMaxValue()
	 * @generated
	 */
	void setMaxValue(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Min Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Value</em>' containment reference.
	 * @see #setMinValue(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_MinValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='minValue' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getMinValue();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getMinValue <em>Min Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Value</em>' containment reference.
	 * @see #getMinValue()
	 * @generated
	 */
	void setMinValue(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(UomLengthPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_Units()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='units' namespace='##targetNamespace'"
	 * @generated
	 */
	UomLengthPropertyType getUnits();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(UomLengthPropertyType value);

	/**
	 * Returns the value of the '<em><b>Peak Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peak Response</em>' containment reference.
	 * @see #setPeakResponse(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_PeakResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='peakResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getPeakResponse();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getPeakResponse <em>Peak Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peak Response</em>' containment reference.
	 * @see #getPeakResponse()
	 * @generated
	 */
	void setPeakResponse(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Bits Per Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bits Per Value</em>' containment reference.
	 * @see #setBitsPerValue(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_BitsPerValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='bitsPerValue' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getBitsPerValue();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getBitsPerValue <em>Bits Per Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bits Per Value</em>' containment reference.
	 * @see #getBitsPerValue()
	 * @generated
	 */
	void setBitsPerValue(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Tone Gradation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tone Gradation</em>' containment reference.
	 * @see #setToneGradation(IntegerPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_ToneGradation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='toneGradation' namespace='##targetNamespace'"
	 * @generated
	 */
	IntegerPropertyType getToneGradation();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getToneGradation <em>Tone Gradation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tone Gradation</em>' containment reference.
	 * @see #getToneGradation()
	 * @generated
	 */
	void setToneGradation(IntegerPropertyType value);

	/**
	 * Returns the value of the '<em><b>Scale Factor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Factor</em>' containment reference.
	 * @see #setScaleFactor(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_ScaleFactor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='scaleFactor' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getScaleFactor();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getScaleFactor <em>Scale Factor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Factor</em>' containment reference.
	 * @see #getScaleFactor()
	 * @generated
	 */
	void setScaleFactor(RealPropertyType value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Offset</em>' containment reference.
	 * @see #setOffset(RealPropertyType)
	 * @see org.isotc211._2005.gmd.GMDPackage#getMDBandType_Offset()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='offset' namespace='##targetNamespace'"
	 * @generated
	 */
	RealPropertyType getOffset();

	/**
	 * Sets the value of the '{@link org.isotc211._2005.gmd.MDBandType#getOffset <em>Offset</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' containment reference.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(RealPropertyType value);

} // MDBandType
