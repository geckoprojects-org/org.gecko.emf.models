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
package de.xoev.xfamilie.elterngeldantrag._1.elterngeld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkuenfte Selbststaendigkeit Gewerbe Land Forstwirtschaft Waehrend Bezugszeitraum Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}</li>
 *   <li>{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#getEinkuenfteBeantragterZeitraum <em>Einkuenfte Beantragter Zeitraum</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType()
 * @model extendedMetaData="name='EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaft.WaehrendBezugszeitraumType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType extends EObject {
	/**
	 * Returns the value of the '<em><b>Steuerfreibetrag Selbstaendigkeit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zum Steuerfreibetrag.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerfreibetrag Selbstaendigkeit</em>' attribute.
	 * @see #isSetSteuerfreibetragSelbstaendigkeit()
	 * @see #unsetSteuerfreibetragSelbstaendigkeit()
	 * @see #setSteuerfreibetragSelbstaendigkeit(boolean)
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_SteuerfreibetragSelbstaendigkeit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='steuerfreibetragSelbstaendigkeit' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSteuerfreibetragSelbstaendigkeit();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerfreibetrag Selbstaendigkeit</em>' attribute.
	 * @see #isSetSteuerfreibetragSelbstaendigkeit()
	 * @see #unsetSteuerfreibetragSelbstaendigkeit()
	 * @see #isSteuerfreibetragSelbstaendigkeit()
	 * @generated
	 */
	void setSteuerfreibetragSelbstaendigkeit(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSteuerfreibetragSelbstaendigkeit()
	 * @see #isSteuerfreibetragSelbstaendigkeit()
	 * @see #setSteuerfreibetragSelbstaendigkeit(boolean)
	 * @generated
	 */
	void unsetSteuerfreibetragSelbstaendigkeit();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType#isSteuerfreibetragSelbstaendigkeit <em>Steuerfreibetrag Selbstaendigkeit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Steuerfreibetrag Selbstaendigkeit</em>' attribute is set.
	 * @see #unsetSteuerfreibetragSelbstaendigkeit()
	 * @see #isSteuerfreibetragSelbstaendigkeit()
	 * @see #setSteuerfreibetragSelbstaendigkeit(boolean)
	 * @generated
	 */
	boolean isSetSteuerfreibetragSelbstaendigkeit();

	/**
	 * Returns the value of the '<em><b>Einkuenfte Beantragter Zeitraum</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.elterngeldantrag._1.elterngeld.EinkuenfteBeantragterZeitraumType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von den Antragstellenden im Antragsservice bereitgestellte Nachweisdokumente (hochgeladene Fotos, Scans, etc.). Siehe auch .
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkuenfte Beantragter Zeitraum</em>' containment reference list.
	 * @see de.xoev.xfamilie.elterngeldantrag._1.elterngeld.ElterngeldPackage#getEinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType_EinkuenfteBeantragterZeitraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='einkuenfteBeantragterZeitraum' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EinkuenfteBeantragterZeitraumType> getEinkuenfteBeantragterZeitraum();

} // EinkuenfteSelbststaendigkeitGewerbeLandForstwirtschaftWaehrendBezugszeitraumType
