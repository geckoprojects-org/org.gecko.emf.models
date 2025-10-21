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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid Or Dashed Stroke Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinecaps <em>Linecaps</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinejoin <em>Linejoin</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getMiterlimit <em>Miterlimit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getWidth <em>Width</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getColor <em>Color</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getBoundary <em>Boundary</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType()
 * @model abstract="true"
 *        extendedMetaData="name='SolidOrDashedStrokeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface SolidOrDashedStrokeType extends StrokeType5 {
	/**
	 * Returns the value of the '<em><b>Linecaps</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "linecaps" steuert die Ausgestaltung am Anfang und Ende eines Linienstücks.
	 * 
	 * Standardwert ist "round".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linecaps</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType
	 * @see #isSetLinecaps()
	 * @see #unsetLinecaps()
	 * @see #setLinecaps(LineCapsType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Linecaps()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='linecaps' namespace='##targetNamespace'"
	 * @generated
	 */
	LineCapsType getLinecaps();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinecaps <em>Linecaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linecaps</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType
	 * @see #isSetLinecaps()
	 * @see #unsetLinecaps()
	 * @see #getLinecaps()
	 * @generated
	 */
	void setLinecaps(LineCapsType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinecaps <em>Linecaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinecaps()
	 * @see #getLinecaps()
	 * @see #setLinecaps(LineCapsType)
	 * @generated
	 */
	void unsetLinecaps();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinecaps <em>Linecaps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linecaps</em>' attribute is set.
	 * @see #unsetLinecaps()
	 * @see #getLinecaps()
	 * @see #setLinecaps(LineCapsType)
	 * @generated
	 */
	boolean isSetLinecaps();

	/**
	 * Returns the value of the '<em><b>Linejoin</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.LineJoinType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "linejoin" steuert die Ausgestaltung der Linie an Knickpunkten.
	 * 
	 * Standardwert ist "round".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linejoin</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineJoinType
	 * @see #isSetLinejoin()
	 * @see #unsetLinejoin()
	 * @see #setLinejoin(LineJoinType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Linejoin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='linejoin' namespace='##targetNamespace'"
	 * @generated
	 */
	LineJoinType getLinejoin();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linejoin</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineJoinType
	 * @see #isSetLinejoin()
	 * @see #unsetLinejoin()
	 * @see #getLinejoin()
	 * @generated
	 */
	void setLinejoin(LineJoinType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinejoin()
	 * @see #getLinejoin()
	 * @see #setLinejoin(LineJoinType)
	 * @generated
	 */
	void unsetLinejoin();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getLinejoin <em>Linejoin</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Linejoin</em>' attribute is set.
	 * @see #unsetLinejoin()
	 * @see #getLinejoin()
	 * @see #setLinejoin(LineJoinType)
	 * @generated
	 */
	boolean isSetLinejoin();

	/**
	 * Returns the value of the '<em><b>Miterlimit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "miterlimit" wirkt bei linejoin=miter und begrenzt die Länge einer Gehrungsspitze an einem spitzen Winkel. 
	 * 
	 * "miterlimit" wird als Verhältnis der Länge der Gehrungsspitze zur Linienbreite ("width") angegeben. 
	 * 
	 * Standardwert ist 4.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Miterlimit</em>' attribute.
	 * @see #isSetMiterlimit()
	 * @see #unsetMiterlimit()
	 * @see #setMiterlimit(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Miterlimit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='miterlimit' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMiterlimit();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getMiterlimit <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miterlimit</em>' attribute.
	 * @see #isSetMiterlimit()
	 * @see #unsetMiterlimit()
	 * @see #getMiterlimit()
	 * @generated
	 */
	void setMiterlimit(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getMiterlimit <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiterlimit()
	 * @see #getMiterlimit()
	 * @see #setMiterlimit(double)
	 * @generated
	 */
	void unsetMiterlimit();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getMiterlimit <em>Miterlimit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Miterlimit</em>' attribute is set.
	 * @see #unsetMiterlimit()
	 * @see #getMiterlimit()
	 * @see #setMiterlimit(double)
	 * @generated
	 */
	boolean isSetMiterlimit();

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "width" bestimmt die Linienbreite. Sie wird angegeben in der Einheit, die durch "mapLengthFactor" vorgegeben ist, Default: mm/100.
	 * 
	 * Standardwert ist 10.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Width()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	boolean isSetWidth();

	/**
	 * Returns the value of the '<em><b>Color</b></em>' containment reference list.
	 * The list contents are of type {@link de.online.adv.namespaces.adv.sk.xml.skadv.ColorType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Farbe des SolidOrDashedStroke-Objekts.
	 * 
	 * Die Auswahl der Farbe unterliegt dem Style, Es darf nur höchstens ein Color-Objekt geben das nach Auswahl über Style mit dem SolidOrDashedStroke-Objekt verbunden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' containment reference list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Color()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='color' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColorType1> getColor();

	/**
	 * Returns the value of the '<em><b>Boundary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mögliche Signaturierung des Rands der Liniensignatur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Boundary</em>' containment reference.
	 * @see #setBoundary(BoundaryType1)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getSolidOrDashedStrokeType_Boundary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='boundary' namespace='##targetNamespace'"
	 * @generated
	 */
	BoundaryType1 getBoundary();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.SolidOrDashedStrokeType#getBoundary <em>Boundary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boundary</em>' containment reference.
	 * @see #getBoundary()
	 * @generated
	 */
	void setBoundary(BoundaryType1 value);

} // SolidOrDashedStrokeType
