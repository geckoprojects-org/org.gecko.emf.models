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
package org.openmicroscopy.ome;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmittance Range Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutIn <em>Cut In</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance <em>Cut In Tolerance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit <em>Cut In Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOut <em>Cut Out</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance <em>Cut Out Tolerance</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit <em>Cut Out Unit</em>}</li>
 *   <li>{@link org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance <em>Transmittance</em>}</li>
 * </ul>
 *
 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType()
 * @model extendedMetaData="name='TransmittanceRange_._type' kind='empty'"
 * @generated
 */
@ProviderType
public interface TransmittanceRangeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cut In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             CutIn is the wavelength below which there is less than 50% transmittance for a filter. Units are set by CutInUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut In</em>' attribute.
	 * @see #isSetCutIn()
	 * @see #unsetCutIn()
	 * @see #setCutIn(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutIn()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='CutIn'"
	 * @generated
	 */
	float getCutIn();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutIn <em>Cut In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut In</em>' attribute.
	 * @see #isSetCutIn()
	 * @see #unsetCutIn()
	 * @see #getCutIn()
	 * @generated
	 */
	void setCutIn(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutIn <em>Cut In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutIn()
	 * @see #getCutIn()
	 * @see #setCutIn(float)
	 * @generated
	 */
	void unsetCutIn();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutIn <em>Cut In</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut In</em>' attribute is set.
	 * @see #unsetCutIn()
	 * @see #getCutIn()
	 * @see #setCutIn(float)
	 * @generated
	 */
	boolean isSetCutIn();

	/**
	 * Returns the value of the '<em><b>Cut In Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             CutInTolerance. Units are set by CutInToleranceUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut In Tolerance</em>' attribute.
	 * @see #isSetCutInTolerance()
	 * @see #unsetCutInTolerance()
	 * @see #setCutInTolerance(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutInTolerance()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeFloat"
	 *        extendedMetaData="kind='attribute' name='CutInTolerance'"
	 * @generated
	 */
	float getCutInTolerance();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance <em>Cut In Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut In Tolerance</em>' attribute.
	 * @see #isSetCutInTolerance()
	 * @see #unsetCutInTolerance()
	 * @see #getCutInTolerance()
	 * @generated
	 */
	void setCutInTolerance(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance <em>Cut In Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutInTolerance()
	 * @see #getCutInTolerance()
	 * @see #setCutInTolerance(float)
	 * @generated
	 */
	void unsetCutInTolerance();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInTolerance <em>Cut In Tolerance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut In Tolerance</em>' attribute is set.
	 * @see #unsetCutInTolerance()
	 * @see #getCutInTolerance()
	 * @see #setCutInTolerance(float)
	 * @generated
	 */
	boolean isSetCutInTolerance();

	/**
	 * Returns the value of the '<em><b>Cut In Tolerance Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the CutInTolerance - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut In Tolerance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutInToleranceUnit()
	 * @see #unsetCutInToleranceUnit()
	 * @see #setCutInToleranceUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutInToleranceUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CutInToleranceUnit'"
	 * @generated
	 */
	UnitsLength getCutInToleranceUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut In Tolerance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutInToleranceUnit()
	 * @see #unsetCutInToleranceUnit()
	 * @see #getCutInToleranceUnit()
	 * @generated
	 */
	void setCutInToleranceUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutInToleranceUnit()
	 * @see #getCutInToleranceUnit()
	 * @see #setCutInToleranceUnit(UnitsLength)
	 * @generated
	 */
	void unsetCutInToleranceUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInToleranceUnit <em>Cut In Tolerance Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut In Tolerance Unit</em>' attribute is set.
	 * @see #unsetCutInToleranceUnit()
	 * @see #getCutInToleranceUnit()
	 * @see #setCutInToleranceUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetCutInToleranceUnit();

	/**
	 * Returns the value of the '<em><b>Cut In Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the CutIn - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut In Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutInUnit()
	 * @see #unsetCutInUnit()
	 * @see #setCutInUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutInUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CutInUnit'"
	 * @generated
	 */
	UnitsLength getCutInUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit <em>Cut In Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut In Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutInUnit()
	 * @see #unsetCutInUnit()
	 * @see #getCutInUnit()
	 * @generated
	 */
	void setCutInUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit <em>Cut In Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutInUnit()
	 * @see #getCutInUnit()
	 * @see #setCutInUnit(UnitsLength)
	 * @generated
	 */
	void unsetCutInUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutInUnit <em>Cut In Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut In Unit</em>' attribute is set.
	 * @see #unsetCutInUnit()
	 * @see #getCutInUnit()
	 * @see #setCutInUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetCutInUnit();

	/**
	 * Returns the value of the '<em><b>Cut Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             CutOut is the wavelength above which there is less than 50% transmittance for a filter. Units are set by CutOutUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Out</em>' attribute.
	 * @see #isSetCutOut()
	 * @see #unsetCutOut()
	 * @see #setCutOut(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutOut()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PositiveFloat"
	 *        extendedMetaData="kind='attribute' name='CutOut'"
	 * @generated
	 */
	float getCutOut();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOut <em>Cut Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out</em>' attribute.
	 * @see #isSetCutOut()
	 * @see #unsetCutOut()
	 * @see #getCutOut()
	 * @generated
	 */
	void setCutOut(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOut <em>Cut Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutOut()
	 * @see #getCutOut()
	 * @see #setCutOut(float)
	 * @generated
	 */
	void unsetCutOut();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOut <em>Cut Out</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Out</em>' attribute is set.
	 * @see #unsetCutOut()
	 * @see #getCutOut()
	 * @see #setCutOut(float)
	 * @generated
	 */
	boolean isSetCutOut();

	/**
	 * Returns the value of the '<em><b>Cut Out Tolerance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             CutOutTolerance. Units are set by CutOutToleranceUnit.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Out Tolerance</em>' attribute.
	 * @see #isSetCutOutTolerance()
	 * @see #unsetCutOutTolerance()
	 * @see #setCutOutTolerance(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutOutTolerance()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.NonNegativeFloat"
	 *        extendedMetaData="kind='attribute' name='CutOutTolerance'"
	 * @generated
	 */
	float getCutOutTolerance();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance <em>Cut Out Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out Tolerance</em>' attribute.
	 * @see #isSetCutOutTolerance()
	 * @see #unsetCutOutTolerance()
	 * @see #getCutOutTolerance()
	 * @generated
	 */
	void setCutOutTolerance(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance <em>Cut Out Tolerance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutOutTolerance()
	 * @see #getCutOutTolerance()
	 * @see #setCutOutTolerance(float)
	 * @generated
	 */
	void unsetCutOutTolerance();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutTolerance <em>Cut Out Tolerance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Out Tolerance</em>' attribute is set.
	 * @see #unsetCutOutTolerance()
	 * @see #getCutOutTolerance()
	 * @see #setCutOutTolerance(float)
	 * @generated
	 */
	boolean isSetCutOutTolerance();

	/**
	 * Returns the value of the '<em><b>Cut Out Tolerance Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the CutOutTolerance - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Out Tolerance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutOutToleranceUnit()
	 * @see #unsetCutOutToleranceUnit()
	 * @see #setCutOutToleranceUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutOutToleranceUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CutOutToleranceUnit'"
	 * @generated
	 */
	UnitsLength getCutOutToleranceUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out Tolerance Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutOutToleranceUnit()
	 * @see #unsetCutOutToleranceUnit()
	 * @see #getCutOutToleranceUnit()
	 * @generated
	 */
	void setCutOutToleranceUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutOutToleranceUnit()
	 * @see #getCutOutToleranceUnit()
	 * @see #setCutOutToleranceUnit(UnitsLength)
	 * @generated
	 */
	void unsetCutOutToleranceUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutToleranceUnit <em>Cut Out Tolerance Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Out Tolerance Unit</em>' attribute is set.
	 * @see #unsetCutOutToleranceUnit()
	 * @see #getCutOutToleranceUnit()
	 * @see #setCutOutToleranceUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetCutOutToleranceUnit();

	/**
	 * Returns the value of the '<em><b>Cut Out Unit</b></em>' attribute.
	 * The default value is <code>"nm"</code>.
	 * The literals are from the enumeration {@link org.openmicroscopy.ome.UnitsLength}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the CutOut - default:nanometres[nm].
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cut Out Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutOutUnit()
	 * @see #unsetCutOutUnit()
	 * @see #setCutOutUnit(UnitsLength)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_CutOutUnit()
	 * @model default="nm" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='CutOutUnit'"
	 * @generated
	 */
	UnitsLength getCutOutUnit();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit <em>Cut Out Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cut Out Unit</em>' attribute.
	 * @see org.openmicroscopy.ome.UnitsLength
	 * @see #isSetCutOutUnit()
	 * @see #unsetCutOutUnit()
	 * @see #getCutOutUnit()
	 * @generated
	 */
	void setCutOutUnit(UnitsLength value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit <em>Cut Out Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCutOutUnit()
	 * @see #getCutOutUnit()
	 * @see #setCutOutUnit(UnitsLength)
	 * @generated
	 */
	void unsetCutOutUnit();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getCutOutUnit <em>Cut Out Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cut Out Unit</em>' attribute is set.
	 * @see #unsetCutOutUnit()
	 * @see #getCutOutUnit()
	 * @see #setCutOutUnit(UnitsLength)
	 * @generated
	 */
	boolean isSetCutOutUnit();

	/**
	 * Returns the value of the '<em><b>Transmittance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *             The amount of light the filter transmits at a maximum [units:none]
	 *             A fraction, as a value from 0.0 to 1.0.
	 *           
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transmittance</em>' attribute.
	 * @see #isSetTransmittance()
	 * @see #unsetTransmittance()
	 * @see #setTransmittance(float)
	 * @see org.openmicroscopy.ome.OMEPackage#getTransmittanceRangeType_Transmittance()
	 * @model unsettable="true" dataType="org.openmicroscopy.ome.PercentFraction"
	 *        extendedMetaData="kind='attribute' name='Transmittance'"
	 * @generated
	 */
	float getTransmittance();

	/**
	 * Sets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance <em>Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transmittance</em>' attribute.
	 * @see #isSetTransmittance()
	 * @see #unsetTransmittance()
	 * @see #getTransmittance()
	 * @generated
	 */
	void setTransmittance(float value);

	/**
	 * Unsets the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance <em>Transmittance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransmittance()
	 * @see #getTransmittance()
	 * @see #setTransmittance(float)
	 * @generated
	 */
	void unsetTransmittance();

	/**
	 * Returns whether the value of the '{@link org.openmicroscopy.ome.TransmittanceRangeType#getTransmittance <em>Transmittance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transmittance</em>' attribute is set.
	 * @see #unsetTransmittance()
	 * @see #getTransmittance()
	 * @see #setTransmittance(float)
	 * @generated
	 */
	boolean isSetTransmittance();

} // TransmittanceRangeType
