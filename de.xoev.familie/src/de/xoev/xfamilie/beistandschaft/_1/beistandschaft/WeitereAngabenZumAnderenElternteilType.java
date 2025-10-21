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
package de.xoev.xfamilie.beistandschaft._1.beistandschaft;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weitere Angaben Zum Anderen Elternteil Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sonstige Angaben zum anderen Elternteil.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung <em>Berufausausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getAngabenBerufsausbildung <em>Angaben Berufsausbildung</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen <em>Nettoeinkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getEinkommen <em>Einkommen</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder <em>Weitere Kinder</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getWeitereKinderAngaben <em>Weitere Kinder Angaben</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType()
 * @model extendedMetaData="name='WeitereAngabenZumAnderenElternteilType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface WeitereAngabenZumAnderenElternteilType extends EObject {
	/**
	 * Returns the value of the '<em><b>Berufausausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Informationen zu der Berufsausbildung des anderen Elternteils vorliegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Berufausausbildung</em>' attribute.
	 * @see #isSetBerufausausbildung()
	 * @see #unsetBerufausausbildung()
	 * @see #setBerufausausbildung(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_Berufausausbildung()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='berufausausbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isBerufausausbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung <em>Berufausausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Berufausausbildung</em>' attribute.
	 * @see #isSetBerufausausbildung()
	 * @see #unsetBerufausausbildung()
	 * @see #isBerufausausbildung()
	 * @generated
	 */
	void setBerufausausbildung(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung <em>Berufausausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBerufausausbildung()
	 * @see #isBerufausausbildung()
	 * @see #setBerufausausbildung(boolean)
	 * @generated
	 */
	void unsetBerufausausbildung();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isBerufausausbildung <em>Berufausausbildung</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Berufausausbildung</em>' attribute is set.
	 * @see #unsetBerufausausbildung()
	 * @see #isBerufausausbildung()
	 * @see #setBerufausausbildung(boolean)
	 * @generated
	 */
	boolean isSetBerufausausbildung();

	/**
	 * Returns the value of the '<em><b>Angaben Berufsausbildung</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Berufsausbildung des anderen Elternteils, sofern dies im Element berufsausbildung bejaht wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angaben Berufsausbildung</em>' attribute.
	 * @see #setAngabenBerufsausbildung(String)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_AngabenBerufsausbildung()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='angabenBerufsausbildung' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAngabenBerufsausbildung();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getAngabenBerufsausbildung <em>Angaben Berufsausbildung</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angaben Berufsausbildung</em>' attribute.
	 * @see #getAngabenBerufsausbildung()
	 * @generated
	 */
	void setAngabenBerufsausbildung(String value);

	/**
	 * Returns the value of the '<em><b>Einkommensverhaeltnisse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Informationen zu den Einkommensverhältnissen des anderen Elternteils vorliegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommensverhaeltnisse</em>' attribute.
	 * @see #isSetEinkommensverhaeltnisse()
	 * @see #unsetEinkommensverhaeltnisse()
	 * @see #setEinkommensverhaeltnisse(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_Einkommensverhaeltnisse()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='einkommensverhaeltnisse' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEinkommensverhaeltnisse();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einkommensverhaeltnisse</em>' attribute.
	 * @see #isSetEinkommensverhaeltnisse()
	 * @see #unsetEinkommensverhaeltnisse()
	 * @see #isEinkommensverhaeltnisse()
	 * @generated
	 */
	void setEinkommensverhaeltnisse(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEinkommensverhaeltnisse()
	 * @see #isEinkommensverhaeltnisse()
	 * @see #setEinkommensverhaeltnisse(boolean)
	 * @generated
	 */
	void unsetEinkommensverhaeltnisse();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isEinkommensverhaeltnisse <em>Einkommensverhaeltnisse</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Einkommensverhaeltnisse</em>' attribute is set.
	 * @see #unsetEinkommensverhaeltnisse()
	 * @see #isEinkommensverhaeltnisse()
	 * @see #setEinkommensverhaeltnisse(boolean)
	 * @generated
	 */
	boolean isSetEinkommensverhaeltnisse();

	/**
	 * Returns the value of the '<em><b>Nettoeinkommen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe zum Nettoeinkommen des anderen Elternteils, sofern bestätigt wurde, dass Informationen zu den Einkommensverhältnissen vorliegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nettoeinkommen</em>' attribute.
	 * @see #isSetNettoeinkommen()
	 * @see #unsetNettoeinkommen()
	 * @see #setNettoeinkommen(float)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_Nettoeinkommen()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='element' name='nettoeinkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	float getNettoeinkommen();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen <em>Nettoeinkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nettoeinkommen</em>' attribute.
	 * @see #isSetNettoeinkommen()
	 * @see #unsetNettoeinkommen()
	 * @see #getNettoeinkommen()
	 * @generated
	 */
	void setNettoeinkommen(float value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen <em>Nettoeinkommen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNettoeinkommen()
	 * @see #getNettoeinkommen()
	 * @see #setNettoeinkommen(float)
	 * @generated
	 */
	void unsetNettoeinkommen();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#getNettoeinkommen <em>Nettoeinkommen</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Nettoeinkommen</em>' attribute is set.
	 * @see #unsetNettoeinkommen()
	 * @see #getNettoeinkommen()
	 * @see #setNettoeinkommen(float)
	 * @generated
	 */
	boolean isSetNettoeinkommen();

	/**
	 * Returns the value of the '<em><b>Einkommen</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.CodeEinkommenAndererElternteilType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum Einkommen des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einkommen</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_Einkommen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='einkommen' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<CodeEinkommenAndererElternteilType> getEinkommen();

	/**
	 * Returns the value of the '<em><b>Weitere Kinder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu weiteren Kindern des anderen Elternteils.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Kinder</em>' attribute.
	 * @see #isSetWeitereKinder()
	 * @see #unsetWeitereKinder()
	 * @see #setWeitereKinder(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_WeitereKinder()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='weitereKinder' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWeitereKinder();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder <em>Weitere Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Kinder</em>' attribute.
	 * @see #isSetWeitereKinder()
	 * @see #unsetWeitereKinder()
	 * @see #isWeitereKinder()
	 * @generated
	 */
	void setWeitereKinder(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder <em>Weitere Kinder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeitereKinder()
	 * @see #isWeitereKinder()
	 * @see #setWeitereKinder(boolean)
	 * @generated
	 */
	void unsetWeitereKinder();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinder <em>Weitere Kinder</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weitere Kinder</em>' attribute is set.
	 * @see #unsetWeitereKinder()
	 * @see #isWeitereKinder()
	 * @see #setWeitereKinder(boolean)
	 * @generated
	 */
	boolean isSetWeitereKinder();

	/**
	 * Returns the value of the '<em><b>Weitere Kinder Im Haushalt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob weitere Kinder zum anderen Elternteil vorhanden sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Kinder Im Haushalt</em>' attribute.
	 * @see #isSetWeitereKinderImHaushalt()
	 * @see #unsetWeitereKinderImHaushalt()
	 * @see #setWeitereKinderImHaushalt(boolean)
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_WeitereKinderImHaushalt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='weitereKinderImHaushalt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWeitereKinderImHaushalt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Kinder Im Haushalt</em>' attribute.
	 * @see #isSetWeitereKinderImHaushalt()
	 * @see #unsetWeitereKinderImHaushalt()
	 * @see #isWeitereKinderImHaushalt()
	 * @generated
	 */
	void setWeitereKinderImHaushalt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWeitereKinderImHaushalt()
	 * @see #isWeitereKinderImHaushalt()
	 * @see #setWeitereKinderImHaushalt(boolean)
	 * @generated
	 */
	void unsetWeitereKinderImHaushalt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereAngabenZumAnderenElternteilType#isWeitereKinderImHaushalt <em>Weitere Kinder Im Haushalt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Weitere Kinder Im Haushalt</em>' attribute is set.
	 * @see #unsetWeitereKinderImHaushalt()
	 * @see #isWeitereKinderImHaushalt()
	 * @see #setWeitereKinderImHaushalt(boolean)
	 * @generated
	 */
	boolean isSetWeitereKinderImHaushalt();

	/**
	 * Returns the value of the '<em><b>Weitere Kinder Angaben</b></em>' containment reference list.
	 * The list contents are of type {@link de.xoev.xfamilie.beistandschaft._1.beistandschaft.WeitereKinderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zu den weiteren Kindern, sofern welche vorhanden sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Kinder Angaben</em>' containment reference list.
	 * @see de.xoev.xfamilie.beistandschaft._1.beistandschaft.BeistandschaftPackage#getWeitereAngabenZumAnderenElternteilType_WeitereKinderAngaben()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='weitereKinderAngaben' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WeitereKinderType> getWeitereKinderAngaben();

} // WeitereAngabenZumAnderenElternteilType
