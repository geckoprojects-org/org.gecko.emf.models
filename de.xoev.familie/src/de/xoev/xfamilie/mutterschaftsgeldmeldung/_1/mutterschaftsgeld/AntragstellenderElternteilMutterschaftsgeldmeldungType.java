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

import de.xoev.xfamilie.baukasten._1.baukasten.NameNatuerlichePersonType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragstellender Elternteil Mutterschaftsgeldmeldung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zum antragstellenden Elternteil.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getName <em>Name</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getGeburt <em>Geburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getEntbindungstag <em>Entbindungstag</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt <em>Kennzeichen Mehrlingsgeburt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getKrankenversichertennummer <em>Krankenversichertennummer</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType()
 * @model extendedMetaData="name='AntragstellenderElternteil.MutterschaftsgeldmeldungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragstellenderElternteilMutterschaftsgeldmeldungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Name des antragstellenden Elternteils. Das Element Geburtsname.unstrukturiert ist im Elterngeldantrag nicht zu verwenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NameNatuerlichePersonType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NameNatuerlichePersonType getName();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NameNatuerlichePersonType value);

	/**
	 * Returns the value of the '<em><b>Geburt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zur Geburt des antragstellenden Elternteils
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geburt</em>' containment reference.
	 * @see #setGeburt(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType_Geburt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='geburt' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getGeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getGeburt <em>Geburt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geburt</em>' containment reference.
	 * @see #getGeburt()
	 * @generated
	 */
	void setGeburt(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Entbindungstag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Entbindungstages
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entbindungstag</em>' attribute.
	 * @see #setEntbindungstag(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType_Entbindungstag()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType" required="true"
	 *        extendedMetaData="kind='element' name='entbindungstag' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getEntbindungstag();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getEntbindungstag <em>Entbindungstag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entbindungstag</em>' attribute.
	 * @see #getEntbindungstag()
	 * @generated
	 */
	void setEntbindungstag(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Kennzeichen Mehrlingsgeburt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bestätigung, sofern der Elterngeldstelle die Mehrlingsgeburt nachgewiesen wird
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzeichen Mehrlingsgeburt</em>' attribute.
	 * @see #isSetKennzeichenMehrlingsgeburt()
	 * @see #unsetKennzeichenMehrlingsgeburt()
	 * @see #setKennzeichenMehrlingsgeburt(boolean)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType_KennzeichenMehrlingsgeburt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='element' name='kennzeichenMehrlingsgeburt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isKennzeichenMehrlingsgeburt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt <em>Kennzeichen Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzeichen Mehrlingsgeburt</em>' attribute.
	 * @see #isSetKennzeichenMehrlingsgeburt()
	 * @see #unsetKennzeichenMehrlingsgeburt()
	 * @see #isKennzeichenMehrlingsgeburt()
	 * @generated
	 */
	void setKennzeichenMehrlingsgeburt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt <em>Kennzeichen Mehrlingsgeburt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetKennzeichenMehrlingsgeburt()
	 * @see #isKennzeichenMehrlingsgeburt()
	 * @see #setKennzeichenMehrlingsgeburt(boolean)
	 * @generated
	 */
	void unsetKennzeichenMehrlingsgeburt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#isKennzeichenMehrlingsgeburt <em>Kennzeichen Mehrlingsgeburt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Kennzeichen Mehrlingsgeburt</em>' attribute is set.
	 * @see #unsetKennzeichenMehrlingsgeburt()
	 * @see #isKennzeichenMehrlingsgeburt()
	 * @see #setKennzeichenMehrlingsgeburt(boolean)
	 * @generated
	 */
	boolean isSetKennzeichenMehrlingsgeburt();

	/**
	 * Returns the value of the '<em><b>Krankenversichertennummer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Krankenversichertennummer, die den Versicherten bei einer Krankenkasse identifiziert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Krankenversichertennummer</em>' attribute.
	 * @see #setKrankenversichertennummer(String)
	 * @see de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.MutterschaftsgeldPackage#getAntragstellenderElternteilMutterschaftsgeldmeldungType_Krankenversichertennummer()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.KrankenversichertennummerType" required="true"
	 *        extendedMetaData="kind='element' name='krankenversichertennummer' namespace='##targetNamespace'"
	 * @generated
	 */
	String getKrankenversichertennummer();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.mutterschaftsgeldmeldung._1.mutterschaftsgeld.AntragstellenderElternteilMutterschaftsgeldmeldungType#getKrankenversichertennummer <em>Krankenversichertennummer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Krankenversichertennummer</em>' attribute.
	 * @see #getKrankenversichertennummer()
	 * @generated
	 */
	void setKrankenversichertennummer(String value);

} // AntragstellenderElternteilMutterschaftsgeldmeldungType
