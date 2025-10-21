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

import de.xoev.xfamilie.baukasten._1.baukasten.CodeZuschuesseType;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Antragdetails Alterssicherung Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Weitere Angaben zur Beantragung von Zuschüssen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getBeantragungZuschussAlterssicherung <em>Beantragung Zuschuss Alterssicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getZuschuesse <em>Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getVonAndererStelle <em>Von Anderer Stelle</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}</li>
 *   <li>{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson <em>Hauptpflegeperson</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType()
 * @model extendedMetaData="name='AntragdetailsAlterssicherungType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface AntragdetailsAlterssicherungType extends EObject {
	/**
	 * Returns the value of the '<em><b>Beantragung Zuschuss Alterssicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hiermit beantrage ich/beantragen wir die Bezuschussung/Übernahme der Kosten meiner/unserer privaten Unfallversicherung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beantragung Zuschuss Alterssicherung</em>' attribute.
	 * @see #setBeantragungZuschussAlterssicherung(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_BeantragungZuschussAlterssicherung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC" required="true"
	 *        extendedMetaData="kind='element' name='beantragungZuschussAlterssicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBeantragungZuschussAlterssicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getBeantragungZuschussAlterssicherung <em>Beantragung Zuschuss Alterssicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beantragung Zuschuss Alterssicherung</em>' attribute.
	 * @see #getBeantragungZuschussAlterssicherung()
	 * @generated
	 */
	void setBeantragungZuschussAlterssicherung(String value);

	/**
	 * Returns the value of the '<em><b>Zuschuesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich erhalte/Wir erhalten keine Zuschüsse/Zuschüsse
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zuschuesse</em>' containment reference.
	 * @see #setZuschuesse(CodeZuschuesseType)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_Zuschuesse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='zuschuesse' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeZuschuesseType getZuschuesse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getZuschuesse <em>Zuschuesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zuschuesse</em>' containment reference.
	 * @see #getZuschuesse()
	 * @generated
	 */
	void setZuschuesse(CodeZuschuesseType value);

	/**
	 * Returns the value of the '<em><b>Hoehe Zuschuesse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuschüsse in Höhe von (monatlich)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehe Zuschuesse</em>' attribute.
	 * @see #isSetHoeheZuschuesse()
	 * @see #unsetHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_HoeheZuschuesse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='hoeheZuschuesse' namespace='##targetNamespace'"
	 * @generated
	 */
	float getHoeheZuschuesse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehe Zuschuesse</em>' attribute.
	 * @see #isSetHoeheZuschuesse()
	 * @see #unsetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @generated
	 */
	void setHoeheZuschuesse(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @generated
	 */
	void unsetHoeheZuschuesse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getHoeheZuschuesse <em>Hoehe Zuschuesse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hoehe Zuschuesse</em>' attribute is set.
	 * @see #unsetHoeheZuschuesse()
	 * @see #getHoeheZuschuesse()
	 * @see #setHoeheZuschuesse(float)
	 * @generated
	 */
	boolean isSetHoeheZuschuesse();

	/**
	 * Returns the value of the '<em><b>Von Anderer Stelle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Von dieser anderen Stelle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Von Anderer Stelle</em>' attribute.
	 * @see #setVonAndererStelle(String)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_VonAndererStelle()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='vonAndererStelle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVonAndererStelle();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#getVonAndererStelle <em>Von Anderer Stelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Von Anderer Stelle</em>' attribute.
	 * @see #getVonAndererStelle()
	 * @generated
	 */
	void setVonAndererStelle(String value);

	/**
	 * Returns the value of the '<em><b>Art Hoehe Absicherung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Bescheinigung über Art und Höhe der Absicherung ist beigefügt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Art Hoehe Absicherung</em>' attribute.
	 * @see #isSetArtHoeheAbsicherung()
	 * @see #unsetArtHoeheAbsicherung()
	 * @see #setArtHoeheAbsicherung(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_ArtHoeheAbsicherung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='artHoeheAbsicherung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isArtHoeheAbsicherung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Art Hoehe Absicherung</em>' attribute.
	 * @see #isSetArtHoeheAbsicherung()
	 * @see #unsetArtHoeheAbsicherung()
	 * @see #isArtHoeheAbsicherung()
	 * @generated
	 */
	void setArtHoeheAbsicherung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetArtHoeheAbsicherung()
	 * @see #isArtHoeheAbsicherung()
	 * @see #setArtHoeheAbsicherung(boolean)
	 * @generated
	 */
	void unsetArtHoeheAbsicherung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isArtHoeheAbsicherung <em>Art Hoehe Absicherung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Art Hoehe Absicherung</em>' attribute is set.
	 * @see #unsetArtHoeheAbsicherung()
	 * @see #isArtHoeheAbsicherung()
	 * @see #setArtHoeheAbsicherung(boolean)
	 * @generated
	 */
	boolean isSetArtHoeheAbsicherung();

	/**
	 * Returns the value of the '<em><b>Alleinige Pflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich betreue die unten aufgeführten Pflegekinder als alleinige Pflegeperson.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Alleinige Pflegeperson</em>' attribute.
	 * @see #isSetAlleinigePflegeperson()
	 * @see #unsetAlleinigePflegeperson()
	 * @see #setAlleinigePflegeperson(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_AlleinigePflegeperson()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='alleinigePflegeperson' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAlleinigePflegeperson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alleinige Pflegeperson</em>' attribute.
	 * @see #isSetAlleinigePflegeperson()
	 * @see #unsetAlleinigePflegeperson()
	 * @see #isAlleinigePflegeperson()
	 * @generated
	 */
	void setAlleinigePflegeperson(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlleinigePflegeperson()
	 * @see #isAlleinigePflegeperson()
	 * @see #setAlleinigePflegeperson(boolean)
	 * @generated
	 */
	void unsetAlleinigePflegeperson();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isAlleinigePflegeperson <em>Alleinige Pflegeperson</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Alleinige Pflegeperson</em>' attribute is set.
	 * @see #unsetAlleinigePflegeperson()
	 * @see #isAlleinigePflegeperson()
	 * @see #setAlleinigePflegeperson(boolean)
	 * @generated
	 */
	boolean isSetAlleinigePflegeperson();

	/**
	 * Returns the value of the '<em><b>Hauptpflegeperson</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ich betreue die unten aufgeführten Pflegekinder als Hauptpflegeperson. Mein Partner erhält keinen Zuschuss aus Jugendhilfemitteln zu seiner Altersvorsorge. (Hauptpflegeperson ist in der Regel die Pflegeperson, die sich aufgrund einer verringerten Erwerbstätigkeit überwiegend um die Pflege und Erziehung der Kinder kümmert.)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hauptpflegeperson</em>' attribute.
	 * @see #isSetHauptpflegeperson()
	 * @see #unsetHauptpflegeperson()
	 * @see #setHauptpflegeperson(boolean)
	 * @see de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AdoptionPackage#getAntragdetailsAlterssicherungType_Hauptpflegeperson()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='hauptpflegeperson' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHauptpflegeperson();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson <em>Hauptpflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hauptpflegeperson</em>' attribute.
	 * @see #isSetHauptpflegeperson()
	 * @see #unsetHauptpflegeperson()
	 * @see #isHauptpflegeperson()
	 * @generated
	 */
	void setHauptpflegeperson(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson <em>Hauptpflegeperson</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHauptpflegeperson()
	 * @see #isHauptpflegeperson()
	 * @see #setHauptpflegeperson(boolean)
	 * @generated
	 */
	void unsetHauptpflegeperson();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.adoptionundpflegekinder._1.adoption.AntragdetailsAlterssicherungType#isHauptpflegeperson <em>Hauptpflegeperson</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hauptpflegeperson</em>' attribute is set.
	 * @see #unsetHauptpflegeperson()
	 * @see #isHauptpflegeperson()
	 * @see #setHauptpflegeperson(boolean)
	 * @generated
	 */
	boolean isSetHauptpflegeperson();

} // AntragdetailsAlterssicherungType
