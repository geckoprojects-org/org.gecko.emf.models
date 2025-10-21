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
package de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss;

import de.xoev.xfamilie.baukasten._1.baukasten.TatsacheMitNachweisType;
import de.xoev.xfamilie.baukasten._1.baukasten.TeilbekanntesDatumType;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ledig Antragstellende Basis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Datentyp für zusätzliche Daten zu ledig. Regel: Falls der Familienstand des Antragstellenden Elternteils "ledig" ist
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getAndererElternteilVerstorben <em>Anderer Elternteil Verstorben</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getVomAnderenElternteilGetrennt <em>Vom Anderen Elternteil Getrennt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getSeitWannGetrennt <em>Seit Wann Getrennt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType()
 * @model extendedMetaData="name='Ledig.Antragstellende.BasisType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface LedigAntragstellendeBasisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Anderer Elternteil Verstorben</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Tod des anderen Elternteils. Es kann ein Nachweis (Sterbeurkunde) mitgesendet werden. Regel: Falls der andere Elternteil verstorben ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anderer Elternteil Verstorben</em>' containment reference.
	 * @see #setAndererElternteilVerstorben(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_AndererElternteilVerstorben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='andererElternteilVerstorben' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getAndererElternteilVerstorben();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getAndererElternteilVerstorben <em>Anderer Elternteil Verstorben</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anderer Elternteil Verstorben</em>' containment reference.
	 * @see #getAndererElternteilVerstorben()
	 * @generated
	 */
	void setAndererElternteilVerstorben(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Lebt Mit Anderem Elternteil Zusammen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Zusammenleben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lebt Mit Anderem Elternteil Zusammen</em>' attribute.
	 * @see #isSetLebtMitAnderemElternteilZusammen()
	 * @see #unsetLebtMitAnderemElternteilZusammen()
	 * @see #setLebtMitAnderemElternteilZusammen(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_LebtMitAnderemElternteilZusammen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='lebtMitAnderemElternteilZusammen' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isLebtMitAnderemElternteilZusammen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lebt Mit Anderem Elternteil Zusammen</em>' attribute.
	 * @see #isSetLebtMitAnderemElternteilZusammen()
	 * @see #unsetLebtMitAnderemElternteilZusammen()
	 * @see #isLebtMitAnderemElternteilZusammen()
	 * @generated
	 */
	void setLebtMitAnderemElternteilZusammen(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLebtMitAnderemElternteilZusammen()
	 * @see #isLebtMitAnderemElternteilZusammen()
	 * @see #setLebtMitAnderemElternteilZusammen(boolean)
	 * @generated
	 */
	void unsetLebtMitAnderemElternteilZusammen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isLebtMitAnderemElternteilZusammen <em>Lebt Mit Anderem Elternteil Zusammen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Lebt Mit Anderem Elternteil Zusammen</em>' attribute is set.
	 * @see #unsetLebtMitAnderemElternteilZusammen()
	 * @see #isLebtMitAnderemElternteilZusammen()
	 * @see #setLebtMitAnderemElternteilZusammen(boolean)
	 * @generated
	 */
	boolean isSetLebtMitAnderemElternteilZusammen();

	/**
	 * Returns the value of the '<em><b>Nie Mit Anderem Elternteil Zusammengelebt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Nicht-Zusammenleben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nie Mit Anderem Elternteil Zusammengelebt</em>' attribute.
	 * @see #isSetNieMitAnderemElternteilZusammengelebt()
	 * @see #unsetNieMitAnderemElternteilZusammengelebt()
	 * @see #setNieMitAnderemElternteilZusammengelebt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_NieMitAnderemElternteilZusammengelebt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='nieMitAnderemElternteilZusammengelebt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isNieMitAnderemElternteilZusammengelebt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nie Mit Anderem Elternteil Zusammengelebt</em>' attribute.
	 * @see #isSetNieMitAnderemElternteilZusammengelebt()
	 * @see #unsetNieMitAnderemElternteilZusammengelebt()
	 * @see #isNieMitAnderemElternteilZusammengelebt()
	 * @generated
	 */
	void setNieMitAnderemElternteilZusammengelebt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNieMitAnderemElternteilZusammengelebt()
	 * @see #isNieMitAnderemElternteilZusammengelebt()
	 * @see #setNieMitAnderemElternteilZusammengelebt(boolean)
	 * @generated
	 */
	void unsetNieMitAnderemElternteilZusammengelebt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isNieMitAnderemElternteilZusammengelebt <em>Nie Mit Anderem Elternteil Zusammengelebt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nie Mit Anderem Elternteil Zusammengelebt</em>' attribute is set.
	 * @see #unsetNieMitAnderemElternteilZusammengelebt()
	 * @see #isNieMitAnderemElternteilZusammengelebt()
	 * @see #setNieMitAnderemElternteilZusammengelebt(boolean)
	 * @generated
	 */
	boolean isSetNieMitAnderemElternteilZusammengelebt();

	/**
	 * Returns the value of the '<em><b>Vater Ist Namentlich Bekannt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Vater. Regel: Falls "nieMitAnderemElternteilZusammengelebt" true ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vater Ist Namentlich Bekannt</em>' attribute.
	 * @see #isSetVaterIstNamentlichBekannt()
	 * @see #unsetVaterIstNamentlichBekannt()
	 * @see #setVaterIstNamentlichBekannt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_VaterIstNamentlichBekannt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vaterIstNamentlichBekannt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVaterIstNamentlichBekannt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vater Ist Namentlich Bekannt</em>' attribute.
	 * @see #isSetVaterIstNamentlichBekannt()
	 * @see #unsetVaterIstNamentlichBekannt()
	 * @see #isVaterIstNamentlichBekannt()
	 * @generated
	 */
	void setVaterIstNamentlichBekannt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaterIstNamentlichBekannt()
	 * @see #isVaterIstNamentlichBekannt()
	 * @see #setVaterIstNamentlichBekannt(boolean)
	 * @generated
	 */
	void unsetVaterIstNamentlichBekannt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isVaterIstNamentlichBekannt <em>Vater Ist Namentlich Bekannt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vater Ist Namentlich Bekannt</em>' attribute is set.
	 * @see #unsetVaterIstNamentlichBekannt()
	 * @see #isVaterIstNamentlichBekannt()
	 * @see #setVaterIstNamentlichBekannt(boolean)
	 * @generated
	 */
	boolean isSetVaterIstNamentlichBekannt();

	/**
	 * Returns the value of the '<em><b>Vom Anderen Elternteil Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum getrennt Leben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vom Anderen Elternteil Getrennt</em>' containment reference.
	 * @see #setVomAnderenElternteilGetrennt(TatsacheMitNachweisType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_VomAnderenElternteilGetrennt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vomAnderenElternteilGetrennt' namespace='##targetNamespace'"
	 * @generated
	 */
	TatsacheMitNachweisType getVomAnderenElternteilGetrennt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getVomAnderenElternteilGetrennt <em>Vom Anderen Elternteil Getrennt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vom Anderen Elternteil Getrennt</em>' containment reference.
	 * @see #getVomAnderenElternteilGetrennt()
	 * @generated
	 */
	void setVomAnderenElternteilGetrennt(TatsacheMitNachweisType value);

	/**
	 * Returns the value of the '<em><b>Seit Wann Getrennt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Zeitpunkt der Trennung. Regel: Falls "vomAnderenElternteilGetrennt" true ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seit Wann Getrennt</em>' containment reference.
	 * @see #setSeitWannGetrennt(TeilbekanntesDatumType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_SeitWannGetrennt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seitWannGetrennt' namespace='##targetNamespace'"
	 * @generated
	 */
	TeilbekanntesDatumType getSeitWannGetrennt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getSeitWannGetrennt <em>Seit Wann Getrennt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seit Wann Getrennt</em>' containment reference.
	 * @see #getSeitWannGetrennt()
	 * @generated
	 */
	void setSeitWannGetrennt(TeilbekanntesDatumType value);

	/**
	 * Returns the value of the '<em><b>Hochzeit Geplant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zu einer geplanten Hochzeit in den nächsten 12 Monaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hochzeit Geplant</em>' attribute.
	 * @see #isSetHochzeitGeplant()
	 * @see #unsetHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_HochzeitGeplant()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='hochzeitGeplant' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isHochzeitGeplant();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hochzeit Geplant</em>' attribute.
	 * @see #isSetHochzeitGeplant()
	 * @see #unsetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @generated
	 */
	void setHochzeitGeplant(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @generated
	 */
	void unsetHochzeitGeplant();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#isHochzeitGeplant <em>Hochzeit Geplant</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Hochzeit Geplant</em>' attribute is set.
	 * @see #unsetHochzeitGeplant()
	 * @see #isHochzeitGeplant()
	 * @see #setHochzeitGeplant(boolean)
	 * @generated
	 */
	boolean isSetHochzeitGeplant();

	/**
	 * Returns the value of the '<em><b>Hochzeitsdatum Voraussichtlich</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voraussichtliches Datum zu einer geplanten Hochzeit. Regel: Nur wenn "hochzeitGeplant" True ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hochzeitsdatum Voraussichtlich</em>' attribute.
	 * @see #setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_HochzeitsdatumVoraussichtlich()
	 * @model dataType="de.xoev.xfamilie.baukasten._1.baukasten.TagesdatumType"
	 *        extendedMetaData="kind='element' name='hochzeitsdatumVoraussichtlich' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getHochzeitsdatumVoraussichtlich();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getHochzeitsdatumVoraussichtlich <em>Hochzeitsdatum Voraussichtlich</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hochzeitsdatum Voraussichtlich</em>' attribute.
	 * @see #getHochzeitsdatumVoraussichtlich()
	 * @generated
	 */
	void setHochzeitsdatumVoraussichtlich(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Getrennt Lebend Grund</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum getrennt Leben. Es kann hier weitere Informationen (z.B. Gründe) gesendet werden. Regel: Falls vom anderen Elternteil getrennt gelebt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #setGetrenntLebendGrund(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getLedigAntragstellendeBasisType_GetrenntLebendGrund()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='getrenntLebendGrund' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGetrenntLebendGrund();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.LedigAntragstellendeBasisType#getGetrenntLebendGrund <em>Getrennt Lebend Grund</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getrennt Lebend Grund</em>' attribute.
	 * @see #getGetrenntLebendGrund()
	 * @generated
	 */
	void setGetrenntLebendGrund(String value);

} // LedigAntragstellendeBasisType
