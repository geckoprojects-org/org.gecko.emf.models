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
package de.xoev.xfamilie.adoptionundpflegekinder._1.adoption;

import de.xoev.xfamilie.baukasten._1.baukasten.CodeEinkommensartenType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einkommen Pflegekind Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angaben zum Einkommen des Pflegekindes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getEinkommenAb <em>Einkommen Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen <em>Hoehe Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getBezugKindergeldAb <em>Bezug Kindergeld Ab</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld <em>Hoehe Kindergeld</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getArtDesEinkommens <em>Art Des Einkommens</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getSonstigesEinkommen <em>Sonstiges Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getZustaendigeFamilienkasse <em>Zustaendige Familienkasse</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType()
 * @model extendedMetaData="name='EinkommenPflegekindType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface EinkommenPflegekindType extends EObject {
	/**
	 * Returns the value of the '<em><b>Einkommen Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einkommen des Pflegekindes ab
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen Ab</em>' attribute.
	 * @see #setEinkommenAb(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_EinkommenAb()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='einkommenAb' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEinkommenAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getEinkommenAb <em>Einkommen Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommen Ab</em>' attribute.
	 * @see #getEinkommenAb()
	 * @generated
	 */
	void setEinkommenAb(String value);

	/**
	 * Returns the value of the '<em><b>Hoehe Einkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Höhe von mtl. €
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Einkommen</em>' attribute.
	 * @see #isSetHoeheEinkommen()
	 * @see #unsetHoeheEinkommen()
	 * @see #setHoeheEinkommen(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_HoeheEinkommen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='hoeheEinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHoeheEinkommen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen <em>Hoehe Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Einkommen</em>' attribute.
	 * @see #isSetHoeheEinkommen()
	 * @see #unsetHoeheEinkommen()
	 * @see #getHoeheEinkommen()
	 * @generated
	 */
	void setHoeheEinkommen(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen <em>Hoehe Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoeheEinkommen()
	 * @see #getHoeheEinkommen()
	 * @see #setHoeheEinkommen(float)
	 * @generated
	 */
	void unsetHoeheEinkommen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheEinkommen <em>Hoehe Einkommen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hoehe Einkommen</em>' attribute is set.
	 * @see #unsetHoeheEinkommen()
	 * @see #getHoeheEinkommen()
	 * @see #setHoeheEinkommen(float)
	 * @generated
	 */
	boolean isSetHoeheEinkommen();

	/**
	 * Returns the value of the '<em><b>Bezug Kindergeld Ab</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kindergeld wird bezogen ab
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezug Kindergeld Ab</em>' attribute.
	 * @see #setBezugKindergeldAb(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_BezugKindergeldAb()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Date"
	 *        extendedMetaData="kind='element' name='bezugKindergeldAb' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getBezugKindergeldAb();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getBezugKindergeldAb <em>Bezug Kindergeld Ab</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezug Kindergeld Ab</em>' attribute.
	 * @see #getBezugKindergeldAb()
	 * @generated
	 */
	void setBezugKindergeldAb(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Hoehe Kindergeld</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In Höhe von mtl. €
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Kindergeld</em>' attribute.
	 * @see #isSetHoeheKindergeld()
	 * @see #unsetHoeheKindergeld()
	 * @see #setHoeheKindergeld(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_HoeheKindergeld()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='hoeheKindergeld' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHoeheKindergeld();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld <em>Hoehe Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Kindergeld</em>' attribute.
	 * @see #isSetHoeheKindergeld()
	 * @see #unsetHoeheKindergeld()
	 * @see #getHoeheKindergeld()
	 * @generated
	 */
	void setHoeheKindergeld(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld <em>Hoehe Kindergeld</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoeheKindergeld()
	 * @see #getHoeheKindergeld()
	 * @see #setHoeheKindergeld(float)
	 * @generated
	 */
	void unsetHoeheKindergeld();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getHoeheKindergeld <em>Hoehe Kindergeld</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hoehe Kindergeld</em>' attribute is set.
	 * @see #unsetHoeheKindergeld()
	 * @see #getHoeheKindergeld()
	 * @see #setHoeheKindergeld(float)
	 * @generated
	 */
	boolean isSetHoeheKindergeld();

	/**
	 * Returns the value of the '<em><b>Art Des Einkommens</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Einkommens
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Des Einkommens</em>' containment reference.
	 * @see #setArtDesEinkommens(CodeEinkommensartenType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_ArtDesEinkommens()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='artDesEinkommens' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeEinkommensartenType getArtDesEinkommens();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getArtDesEinkommens <em>Art Des Einkommens</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Des Einkommens</em>' containment reference.
	 * @see #getArtDesEinkommens()
	 * @generated
	 */
	void setArtDesEinkommens(CodeEinkommensartenType value);

	/**
	 * Returns the value of the '<em><b>Sonstiges Einkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wenn Sonstiges, bitte hier angeben
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sonstiges Einkommen</em>' attribute.
	 * @see #setSonstigesEinkommen(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_SonstigesEinkommen()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='sonstigesEinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSonstigesEinkommen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getSonstigesEinkommen <em>Sonstiges Einkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sonstiges Einkommen</em>' attribute.
	 * @see #getSonstigesEinkommen()
	 * @generated
	 */
	void setSonstigesEinkommen(String value);

	/**
	 * Returns the value of the '<em><b>Zustaendige Familienkasse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die ergänzende Angabe der zuständigen bzw. auszahlenden Familienkasse zu Bezugsbeginn und der Höhe des Kindergeldes wird für Rückfragen bei auftretenden Unklarheiten zur Höhe des Einkommens des Pflegekindes benötigt. Rechtsgrundlage: § 39 Abs. 4 SGB VIII i: V. m. 633, 35a SGB VIII.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zustaendige Familienkasse</em>' attribute.
	 * @see #setZustaendigeFamilienkasse(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getEinkommenPflegekindType_ZustaendigeFamilienkasse()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='zustaendigeFamilienkasse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZustaendigeFamilienkasse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.EinkommenPflegekindType#getZustaendigeFamilienkasse <em>Zustaendige Familienkasse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zustaendige Familienkasse</em>' attribute.
	 * @see #getZustaendigeFamilienkasse()
	 * @generated
	 */
	void setZustaendigeFamilienkasse(String value);

} // EinkommenPflegekindType
