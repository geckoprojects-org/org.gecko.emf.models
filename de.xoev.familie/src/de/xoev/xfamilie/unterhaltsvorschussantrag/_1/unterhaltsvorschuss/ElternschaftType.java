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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Elternschaft Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Daten zur Elternschaft. Hinweis: In späteren Versionen sollen die Informationen dieses Elements und seiner Kindelement mit den Elementen "kindschaftsbeziehung" und "Familienstand" abgebildet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind <em>Eheliches Antragskind</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNachweis <em>Nachweis</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNameVater <em>Name Vater</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getAngabedesGerichts <em>Angabedes Gerichts</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getWeitereInformation <em>Weitere Information</em>}</li>
 *   <li>{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}</li>
 * </ul>
 *
 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType()
 * @model extendedMetaData="name='ElternschaftType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface ElternschaftType extends EObject {
	/**
	 * Returns the value of the '<em><b>Eheliches Antragskind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob das Antragskind ehelich ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eheliches Antragskind</em>' attribute.
	 * @see #isSetEhelichesAntragskind()
	 * @see #unsetEhelichesAntragskind()
	 * @see #setEhelichesAntragskind(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_EhelichesAntragskind()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ehelichesAntragskind' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEhelichesAntragskind();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind <em>Eheliches Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eheliches Antragskind</em>' attribute.
	 * @see #isSetEhelichesAntragskind()
	 * @see #unsetEhelichesAntragskind()
	 * @see #isEhelichesAntragskind()
	 * @generated
	 */
	void setEhelichesAntragskind(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind <em>Eheliches Antragskind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEhelichesAntragskind()
	 * @see #isEhelichesAntragskind()
	 * @see #setEhelichesAntragskind(boolean)
	 * @generated
	 */
	void unsetEhelichesAntragskind();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhelichesAntragskind <em>Eheliches Antragskind</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Eheliches Antragskind</em>' attribute is set.
	 * @see #unsetEhelichesAntragskind()
	 * @see #isEhelichesAntragskind()
	 * @see #setEhelichesAntragskind(boolean)
	 * @generated
	 */
	boolean isSetEhelichesAntragskind();

	/**
	 * Returns the value of the '<em><b>Vaterschaft Anerkannt Oder Festgestellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob die Vaterschaft anerkannt oder festgestellt wurde. Regel: Falls "ehelichesAntragskind" "false" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vaterschaft Anerkannt Oder Festgestellt</em>' attribute.
	 * @see #isSetVaterschaftAnerkanntOderFestgestellt()
	 * @see #unsetVaterschaftAnerkanntOderFestgestellt()
	 * @see #setVaterschaftAnerkanntOderFestgestellt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_VaterschaftAnerkanntOderFestgestellt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vaterschaftAnerkanntOderFestgestellt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVaterschaftAnerkanntOderFestgestellt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vaterschaft Anerkannt Oder Festgestellt</em>' attribute.
	 * @see #isSetVaterschaftAnerkanntOderFestgestellt()
	 * @see #unsetVaterschaftAnerkanntOderFestgestellt()
	 * @see #isVaterschaftAnerkanntOderFestgestellt()
	 * @generated
	 */
	void setVaterschaftAnerkanntOderFestgestellt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVaterschaftAnerkanntOderFestgestellt()
	 * @see #isVaterschaftAnerkanntOderFestgestellt()
	 * @see #setVaterschaftAnerkanntOderFestgestellt(boolean)
	 * @generated
	 */
	void unsetVaterschaftAnerkanntOderFestgestellt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isVaterschaftAnerkanntOderFestgestellt <em>Vaterschaft Anerkannt Oder Festgestellt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vaterschaft Anerkannt Oder Festgestellt</em>' attribute is set.
	 * @see #unsetVaterschaftAnerkanntOderFestgestellt()
	 * @see #isVaterschaftAnerkanntOderFestgestellt()
	 * @see #setVaterschaftAnerkanntOderFestgestellt(boolean)
	 * @generated
	 */
	boolean isSetVaterschaftAnerkanntOderFestgestellt();

	/**
	 * Returns the value of the '<em><b>Ehemann Ist Leiblicher Vater</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, ob der Ehemann der Mutter auch der Vater des Kindes ist. Regel: Falls "ehelichesAntragskind" "true" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ehemann Ist Leiblicher Vater</em>' attribute.
	 * @see #isSetEhemannIstLeiblicherVater()
	 * @see #unsetEhemannIstLeiblicherVater()
	 * @see #setEhemannIstLeiblicherVater(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_EhemannIstLeiblicherVater()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ehemannIstLeiblicherVater' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isEhemannIstLeiblicherVater();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ehemann Ist Leiblicher Vater</em>' attribute.
	 * @see #isSetEhemannIstLeiblicherVater()
	 * @see #unsetEhemannIstLeiblicherVater()
	 * @see #isEhemannIstLeiblicherVater()
	 * @generated
	 */
	void setEhemannIstLeiblicherVater(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEhemannIstLeiblicherVater()
	 * @see #isEhemannIstLeiblicherVater()
	 * @see #setEhemannIstLeiblicherVater(boolean)
	 * @generated
	 */
	void unsetEhemannIstLeiblicherVater();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isEhemannIstLeiblicherVater <em>Ehemann Ist Leiblicher Vater</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ehemann Ist Leiblicher Vater</em>' attribute is set.
	 * @see #unsetEhemannIstLeiblicherVater()
	 * @see #isEhemannIstLeiblicherVater()
	 * @see #setEhemannIstLeiblicherVater(boolean)
	 * @generated
	 */
	boolean isSetEhemannIstLeiblicherVater();

	/**
	 * Returns the value of the '<em><b>Nachweis</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hier erfolgt mittels Angabe einer UUID die Referenz auf die zugehörige Nachricht vom Typ nachweisnachricht.0311; es ist deren Element nachrichtenUUID anzugeben. Hier wird zusätzlich die Möglichkeit gegeben mehrere UUID pro Nachweis zu vergeben, da es sein kann, dass ein Nachweis in mehreren Nachrichten der nachweisnachricht.0311 geschickt werden; Regel: Zulaessige Nachweise sind:, wenn "vaterschaftAnerkanntOderFestgestellt" "true" ist, Geburtsurkunde/Jugendamtsurkunde/Gerichtsbeschluss; wenn "antragFeststellungGestellt" "true" ist, nur der Antrag auf Feststellung; wenn "adoptiertesKind" "true" ist, ein Nachweis zur Adoption.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nachweis</em>' attribute list.
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_Nachweis()
	 * @model unique="false" dataType="de.xoev.xfamilie.baukasten._1.baukasten.UUIDType"
	 *        extendedMetaData="kind='element' name='nachweis' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNachweis();

	/**
	 * Returns the value of the '<em><b>Name Vater</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Daten zum Vater des Kindes. Regel: Falls "vaterschaftAnerkanntOderFestgestellt" "false" ist oder "ehemannIstLeiblicherVater" "false" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Vater</em>' containment reference.
	 * @see #setNameVater(NameOptionalType)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_NameVater()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nameVater' namespace='##targetNamespace'"
	 * @generated
	 */
	NameOptionalType getNameVater();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getNameVater <em>Name Vater</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Vater</em>' containment reference.
	 * @see #getNameVater()
	 * @generated
	 */
	void setNameVater(NameOptionalType value);

	/**
	 * Returns the value of the '<em><b>Antrag Feststellung Gestellt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Antrag auf Feststellung. Regel: Falls "vaterschaftAnerkanntOderFestgestellt" "false" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antrag Feststellung Gestellt</em>' attribute.
	 * @see #isSetAntragFeststellungGestellt()
	 * @see #unsetAntragFeststellungGestellt()
	 * @see #setAntragFeststellungGestellt(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_AntragFeststellungGestellt()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='antragFeststellungGestellt' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntragFeststellungGestellt();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Feststellung Gestellt</em>' attribute.
	 * @see #isSetAntragFeststellungGestellt()
	 * @see #unsetAntragFeststellungGestellt()
	 * @see #isAntragFeststellungGestellt()
	 * @generated
	 */
	void setAntragFeststellungGestellt(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntragFeststellungGestellt()
	 * @see #isAntragFeststellungGestellt()
	 * @see #setAntragFeststellungGestellt(boolean)
	 * @generated
	 */
	void unsetAntragFeststellungGestellt();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragFeststellungGestellt <em>Antrag Feststellung Gestellt</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antrag Feststellung Gestellt</em>' attribute is set.
	 * @see #unsetAntragFeststellungGestellt()
	 * @see #isAntragFeststellungGestellt()
	 * @see #setAntragFeststellungGestellt(boolean)
	 * @generated
	 */
	boolean isSetAntragFeststellungGestellt();

	/**
	 * Returns the value of the '<em><b>Antrag Anfechtung Anhaengig</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zur Anfechtung der Vaterschaft. Regel: Falls "ehemannIstLeiblicherVater" false" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Antrag Anfechtung Anhaengig</em>' attribute.
	 * @see #isSetAntragAnfechtungAnhaengig()
	 * @see #unsetAntragAnfechtungAnhaengig()
	 * @see #setAntragAnfechtungAnhaengig(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_AntragAnfechtungAnhaengig()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='antragAnfechtungAnhaengig' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAntragAnfechtungAnhaengig();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Antrag Anfechtung Anhaengig</em>' attribute.
	 * @see #isSetAntragAnfechtungAnhaengig()
	 * @see #unsetAntragAnfechtungAnhaengig()
	 * @see #isAntragAnfechtungAnhaengig()
	 * @generated
	 */
	void setAntragAnfechtungAnhaengig(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAntragAnfechtungAnhaengig()
	 * @see #isAntragAnfechtungAnhaengig()
	 * @see #setAntragAnfechtungAnhaengig(boolean)
	 * @generated
	 */
	void unsetAntragAnfechtungAnhaengig();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAntragAnfechtungAnhaengig <em>Antrag Anfechtung Anhaengig</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Antrag Anfechtung Anhaengig</em>' attribute is set.
	 * @see #unsetAntragAnfechtungAnhaengig()
	 * @see #isAntragAnfechtungAnhaengig()
	 * @see #setAntragAnfechtungAnhaengig(boolean)
	 * @generated
	 */
	boolean isSetAntragAnfechtungAnhaengig();

	/**
	 * Returns the value of the '<em><b>Angabedes Gerichts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum zum Gericht, bei dem die Anfechtungsklage anhängig ist. Regel: Falls "antragAnfechtunganhaengig "true" ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angabedes Gerichts</em>' attribute.
	 * @see #setAngabedesGerichts(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_AngabedesGerichts()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='angabedesGerichts' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAngabedesGerichts();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getAngabedesGerichts <em>Angabedes Gerichts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angabedes Gerichts</em>' attribute.
	 * @see #getAngabedesGerichts()
	 * @generated
	 */
	void setAngabedesGerichts(String value);

	/**
	 * Returns the value of the '<em><b>Weitere Information</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum für weitere Informationen, falls es Unklarheiten bei der Elternschaft gibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weitere Information</em>' attribute.
	 * @see #setWeitereInformation(String)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_WeitereInformation()
	 * @model dataType="de.xoev.kosit.datentyp._202204.din91379.DatatypeC"
	 *        extendedMetaData="kind='element' name='weitereInformation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getWeitereInformation();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#getWeitereInformation <em>Weitere Information</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weitere Information</em>' attribute.
	 * @see #getWeitereInformation()
	 * @generated
	 */
	void setWeitereInformation(String value);

	/**
	 * Returns the value of the '<em><b>Angabe Ob Bei Geburt Verheiratet</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Antragssteller bei der Geburt des Kindes mit dem anderen Elternteil verheiratet war.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Angabe Ob Bei Geburt Verheiratet</em>' attribute.
	 * @see #isSetAngabeObBeiGeburtVerheiratet()
	 * @see #unsetAngabeObBeiGeburtVerheiratet()
	 * @see #setAngabeObBeiGeburtVerheiratet(boolean)
	 * @see de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.UnterhaltsvorschussPackage#getElternschaftType_AngabeObBeiGeburtVerheiratet()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='angabeObBeiGeburtVerheiratet' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isAngabeObBeiGeburtVerheiratet();

	/**
	 * Sets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angabe Ob Bei Geburt Verheiratet</em>' attribute.
	 * @see #isSetAngabeObBeiGeburtVerheiratet()
	 * @see #unsetAngabeObBeiGeburtVerheiratet()
	 * @see #isAngabeObBeiGeburtVerheiratet()
	 * @generated
	 */
	void setAngabeObBeiGeburtVerheiratet(boolean value);

	/**
	 * Unsets the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAngabeObBeiGeburtVerheiratet()
	 * @see #isAngabeObBeiGeburtVerheiratet()
	 * @see #setAngabeObBeiGeburtVerheiratet(boolean)
	 * @generated
	 */
	void unsetAngabeObBeiGeburtVerheiratet();

	/**
	 * Returns whether the value of the '{@link de.xoev.xfamilie.unterhaltsvorschussantrag._1.unterhaltsvorschuss.ElternschaftType#isAngabeObBeiGeburtVerheiratet <em>Angabe Ob Bei Geburt Verheiratet</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Angabe Ob Bei Geburt Verheiratet</em>' attribute is set.
	 * @see #unsetAngabeObBeiGeburtVerheiratet()
	 * @see #isAngabeObBeiGeburtVerheiratet()
	 * @see #setAngabeObBeiGeburtVerheiratet(boolean)
	 * @generated
	 */
	boolean isSetAngabeObBeiGeburtVerheiratet();

} // ElternschaftType
