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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tube Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinecaps <em>Linecaps</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinejoin <em>Linejoin</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getMiterlimit <em>Miterlimit</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTubeType()
 * @model extendedMetaData="name='TubeType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface TubeType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Linecaps</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Property "linecaps" steuert die Ausgestaltung am Anfang und Ende eines Schlauchstücks.
	 * 
	 * Standardwert ist "round".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linecaps</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineCapsType
	 * @see #isSetLinecaps()
	 * @see #unsetLinecaps()
	 * @see #setLinecaps(LineCapsType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTubeType_Linecaps()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='linecaps' namespace='##targetNamespace'"
	 * @generated
	 */
	LineCapsType getLinecaps();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinecaps <em>Linecaps</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinecaps <em>Linecaps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinecaps()
	 * @see #getLinecaps()
	 * @see #setLinecaps(LineCapsType)
	 * @generated
	 */
	void unsetLinecaps();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinecaps <em>Linecaps</em>}' attribute is set.
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
	 * Das Property "linejoin" steuert die Ausgestaltung des Schlauchs an Knickpunkten.
	 * 
	 * Standardwert ist "round".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linejoin</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.LineJoinType
	 * @see #isSetLinejoin()
	 * @see #unsetLinejoin()
	 * @see #setLinejoin(LineJoinType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTubeType_Linejoin()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='linejoin' namespace='##targetNamespace'"
	 * @generated
	 */
	LineJoinType getLinejoin();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinejoin <em>Linejoin</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinejoin <em>Linejoin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLinejoin()
	 * @see #getLinejoin()
	 * @see #setLinejoin(LineJoinType)
	 * @generated
	 */
	void unsetLinejoin();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getLinejoin <em>Linejoin</em>}' attribute is set.
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
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTubeType_Miterlimit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='miterlimit' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMiterlimit();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getMiterlimit <em>Miterlimit</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getMiterlimit <em>Miterlimit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMiterlimit()
	 * @see #getMiterlimit()
	 * @see #setMiterlimit(double)
	 * @generated
	 */
	void unsetMiterlimit();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getMiterlimit <em>Miterlimit</em>}' attribute is set.
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
	 * Das Property "width" bestimmt die Schlauchbreite. Sie wird angegeben in der Einheit, die durch "mapLengthFactor" vorgegeben ist, Default: mm/100.
	 * 
	 * Standardwert ist 10.0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #isSetWidth()
	 * @see #unsetWidth()
	 * @see #setWidth(double)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getTubeType_Width()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='width' namespace='##targetNamespace'"
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getWidth <em>Width</em>}' attribute.
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
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	void unsetWidth();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.TubeType#getWidth <em>Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Width</em>' attribute is set.
	 * @see #unsetWidth()
	 * @see #getWidth()
	 * @see #setWidth(double)
	 * @generated
	 */
	boolean isSetWidth();

} // TubeType
