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
 * A representation of the model object '<em><b>Mutterschaftsgeldmeldung Rueckmeldung0502 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAngabenEntbindung <em>Angaben Entbindung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getStornierung <em>Stornierung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getKennzeichenMutterschaftsgeld <em>Kennzeichen Mutterschaftsgeld</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type()
 * @model extendedMetaData="name='mutterschaftsgeldmeldung.rueckmeldung.0502_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface MutterschaftsgeldmeldungRueckmeldung0502Type extends NachrichtType {
	/**
	 * Returns the value of the '<em><b>Aktenzeichen Elterngeldstelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aktenzeichen/Geschäftszeichen der Elterngeldstelle für die Elterngeldbeantragende.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aktenzeichen Elterngeldstelle</em>' attribute.
	 * @see #setAktenzeichenElterngeldstelle(String)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type_AktenzeichenElterngeldstelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='aktenzeichenElterngeldstelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAktenzeichenElterngeldstelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAktenzeichenElterngeldstelle <em>Aktenzeichen Elterngeldstelle</em>}' attribute.
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
	 * @see #setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type_AntragstellenderElternteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='antragstellenderElternteil' namespace='##targetNamespace'"
	 * @generated
	 */
	AntragstellenderElternteilMutterschaftsgeldmeldungRueckType getAntragstellenderElternteil();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAntragstellenderElternteil <em>Antragstellender Elternteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antragstellender Elternteil</em>' containment reference.
	 * @see #getAntragstellenderElternteil()
	 * @generated
	 */
	void setAntragstellenderElternteil(AntragstellenderElternteilMutterschaftsgeldmeldungRueckType value);

	/**
	 * Returns the value of the '<em><b>Angaben Entbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angaben Entbindung</em>' containment reference.
	 * @see #setAngabenEntbindung(AngabenEntbindungType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type_AngabenEntbindung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='angabenEntbindung' namespace='##targetNamespace'"
	 * @generated
	 */
	AngabenEntbindungType getAngabenEntbindung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getAngabenEntbindung <em>Angaben Entbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Entbindung</em>' containment reference.
	 * @see #getAngabenEntbindung()
	 * @generated
	 */
	void setAngabenEntbindung(AngabenEntbindungType value);

	/**
	 * Returns the value of the '<em><b>Stornierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stornierung</em>' containment reference.
	 * @see #setStornierung(StornierungType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type_Stornierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stornierung' namespace='##targetNamespace'"
	 * @generated
	 */
	StornierungType getStornierung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getStornierung <em>Stornierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stornierung</em>' containment reference.
	 * @see #getStornierung()
	 * @generated
	 */
	void setStornierung(StornierungType value);

	/**
	 * Returns the value of the '<em><b>Kennzeichen Mutterschaftsgeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kennzeichen Mutterschaftsgeld</em>' containment reference.
	 * @see #setKennzeichenMutterschaftsgeld(CodeKennzeichenMutterschaftsgeldType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getMutterschaftsgeldmeldungRueckmeldung0502Type_KennzeichenMutterschaftsgeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='kennzeichenMutterschaftsgeld' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeKennzeichenMutterschaftsgeldType getKennzeichenMutterschaftsgeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldmeldungRueckmeldung0502Type#getKennzeichenMutterschaftsgeld <em>Kennzeichen Mutterschaftsgeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzeichen Mutterschaftsgeld</em>' containment reference.
	 * @see #getKennzeichenMutterschaftsgeld()
	 * @generated
	 */
	void setKennzeichenMutterschaftsgeld(CodeKennzeichenMutterschaftsgeldType value);

} // MutterschaftsgeldmeldungRueckmeldung0502Type
