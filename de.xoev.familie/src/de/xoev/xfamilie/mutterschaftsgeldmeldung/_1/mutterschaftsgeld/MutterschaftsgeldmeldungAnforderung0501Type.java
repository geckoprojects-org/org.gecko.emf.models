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
package de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld;

import de.xoev.xfamilie.baukasten._1.baukasten.NachrichtType;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mutterschaftsgeldmeldung Anforderung0501 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung <em>Einwilligung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getStornierung <em>Stornierung</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungAnforderung0501Type()
 * @model extendedMetaData="name='mutterschaftsgeldmeldung.anforderung.0501_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MutterschaftsgeldmeldungAnforderung0501Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktenzeichen/Geschäftszeichen der Elterngeldstelle für die Elterngeldbeantragende.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen Elterngeldstelle</em>' attribute.
	 * @see #setAktenzeichenElterngeldstelle(String)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungAnforderung0501Type_AktenzeichenElterngeldstelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='aktenzeichenElterngeldstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenElterngeldstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aktenzeichen Elterngeldstelle</em>' attribute.
	 * @see #getAktenzeichenElterngeldstelle()
	 * @generated
	 */
	void setAktenzeichenElterngeldstelle(String value);

	/**
	 * Returns the value of the '<em><b>Antragstellender Elternteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungAnforderung0501Type_AntragstellenderElternteil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='antragstellenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellenderElternteilMutterschaftsgeldmeldungType getAntragstellenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 */
	void setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungType value);

	/**
	 * Returns the value of the '<em><b>Einwilligung</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Einwilligung</em>' attribute.
	 * @see #isSetEinwilligung()
	 * @see #unsetEinwilligung()
	 * @see #setEinwilligung(boolean)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungAnforderung0501Type_Einwilligung()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='einwilligung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinwilligung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung <em>Einwilligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwilligung</em>' attribute.
	 * @see #isSetEinwilligung()
	 * @see #unsetEinwilligung()
	 * @see #isEinwilligung()
	 * @generated
	 */
	void setEinwilligung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung <em>Einwilligung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinwilligung()
	 * @see #isEinwilligung()
	 * @see #setEinwilligung(boolean)
	 * @generated
	 */
	void unsetEinwilligung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#isEinwilligung <em>Einwilligung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einwilligung</em>' attribute is set.
	 * @see #unsetEinwilligung()
	 * @see #isEinwilligung()
	 * @see #setEinwilligung(boolean)
	 * @generated
	 */
	boolean isSetEinwilligung();

	/**
	 * Returns the value of the '<em><b>Stornierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stornierung</em>' containment reference.
	 * @see #setStornierung(StornierungType1)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungAnforderung0501Type_Stornierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stornierung' namespace='##targetNamespace'"
	 * @generated
	 */
	StornierungType1 getStornierung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungAnforderung0501Type#getStornierung <em>Stornierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stornierung</em>' containment reference.
	 * @see #getStornierung()
	 * @generated
	 */
	void setStornierung(StornierungType1 value);

} // MutterschaftsgeldmeldungAnforderung0501Type
