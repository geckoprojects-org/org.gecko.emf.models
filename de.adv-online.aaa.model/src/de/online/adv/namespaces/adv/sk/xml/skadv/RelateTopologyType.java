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
 * A representation of the model object '<em><b>Relate Topology Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getSelmode <em>Selmode</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getNeighborhoodFilter <em>Neighborhood Filter</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateTopologyType()
 * @model extendedMetaData="name='RelateTopologyType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface RelateTopologyType extends PlacementRuleType {
	/**
	 * Returns the value of the '<em><b>Selmode</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.NeighborSelModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Attribut steuert, wie die Auswahl der Nachbarn als Geometrie umgesetzt werden soll.
	 * 
	 * Der Wert "selected" fordert, dass genau die Begrenzungslinien zu den ausgewählten Nachbarn zum Zuge kommen.
	 * 
	 * "notSelected" bestimmt, dass genau die anderen Begrenzungslinien herangezogen werden.
	 * 
	 * "noNeighbor" verlangt, die Ausgabe der Randgeometrien, bei denen kein Nachbar vorliegt. Dies ist vom "neighborhoodFilter" unabhängig, der deshalb auch nicht angegeben werden muss.
	 * 
	 * Bei Auslassung gilt "selected".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selmode</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NeighborSelModeType
	 * @see #isSetSelmode()
	 * @see #unsetSelmode()
	 * @see #setSelmode(NeighborSelModeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateTopologyType_Selmode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='selmode' namespace='##targetNamespace'"
	 * @generated
	 */
	NeighborSelModeType getSelmode();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getSelmode <em>Selmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selmode</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.NeighborSelModeType
	 * @see #isSetSelmode()
	 * @see #unsetSelmode()
	 * @see #getSelmode()
	 * @generated
	 */
	void setSelmode(NeighborSelModeType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getSelmode <em>Selmode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSelmode()
	 * @see #getSelmode()
	 * @see #setSelmode(NeighborSelModeType)
	 * @generated
	 */
	void unsetSelmode();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getSelmode <em>Selmode</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Selmode</em>' attribute is set.
	 * @see #unsetSelmode()
	 * @see #getSelmode()
	 * @see #setSelmode(NeighborSelModeType)
	 * @generated
	 */
	boolean isSetSelmode();

	/**
	 * Returns the value of the '<em><b>Neighborhood Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der referierte Filter wählt unter den direkten Nachbarn eines auszugebenden Flächenobjekts aus. Letzteres ist im Filter über die Variable $emit sichtbar.
	 * 
	 * Bei Auslassung werden alle Nachbarn gewählt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Neighborhood Filter</em>' containment reference.
	 * @see #setNeighborhoodFilter(NeighborhoodFilterType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getRelateTopologyType_NeighborhoodFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='neighborhoodFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	NeighborhoodFilterType getNeighborhoodFilter();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.RelateTopologyType#getNeighborhoodFilter <em>Neighborhood Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighborhood Filter</em>' containment reference.
	 * @see #getNeighborhoodFilter()
	 * @generated
	 */
	void setNeighborhoodFilter(NeighborhoodFilterType value);

} // RelateTopologyType
