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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashed Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getDasharray <em>Dasharray</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getAdjustment <em>Adjustment</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDashedStrokeType()
 * @model extendedMetaData="name='DashedStrokeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface DashedStrokeType extends SolidOrDashedStrokeType {
	/**
	 * Returns the value of the '<em><b>Dasharray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * "dasharray" enthält die Längen der Strichlierungsbestandteile in der Einheit, die durch "mapLengthFactor" vorgegeben ist, Default: mm/100. 
	 * 
	 * Der erste Eintrag beschreibt ein Linienstück, der nächste eine Lücke, usw. "dasharray" muss deshalb geradzahlig viele Angaben aufweisen. 
	 * 
	 * Linienstücke der Länge 0 sind erlaubt. Sie definieren bei linecaps=round einen Kreis mit Durchmesser "width".
	 * 
	 * "dasharray" wird im SK-XML als Liste dargestellt und nicht durch ein multipel auftretendes Property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dasharray</em>' attribute.
	 * @see #setDasharray(List)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDashedStrokeType_Dasharray()
	 * @model dataType="de.online.adv.namespaces.adv.sk.xml.skadv.DasharrayType" required="true" many="false"
	 *        extendedMetaData="kind='element' name='dasharray' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Double> getDasharray();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getDasharray <em>Dasharray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dasharray</em>' attribute.
	 * @see #getDasharray()
	 * @generated
	 */
	void setDasharray(List<Double> value);

	/**
	 * Returns the value of the '<em><b>Adjustment</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch "adjustment" kann der Ausgleich des Musters in der Gesamtgeometrie (ohne die Lücken am Anfang und Ende) gefordert werden. 
	 * 
	 * Standardwert ist "none", also kein Ausgleich. Bei "wholePattern" werden Lücken und Striche verlängert bzw. verkürzt.
	 * 
	 * Eine Skizze des Verfahrens für den Musterausgleich bei "wholePattern" befindet sich in dessen Definition beim Typ Adjustment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getDashedStrokeType_Adjustment()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='adjustment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdjustmentType getAdjustment();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adjustment</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AdjustmentType
	 * @see #isSetAdjustment()
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @generated
	 */
	void setAdjustment(AdjustmentType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getAdjustment <em>Adjustment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	void unsetAdjustment();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.DashedStrokeType#getAdjustment <em>Adjustment</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Adjustment</em>' attribute is set.
	 * @see #unsetAdjustment()
	 * @see #getAdjustment()
	 * @see #setAdjustment(AdjustmentType)
	 * @generated
	 */
	boolean isSetAdjustment();

} // DashedStrokeType
