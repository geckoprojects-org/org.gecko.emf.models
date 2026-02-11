/*
 * Copyright (c) 2012 - 2026 Data In Motion and others.
 * All rights reserved.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Data In Motion - initial API and implementation
 */
package org.docbook.ns.docbook;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

import org.w3._1999.xlink.ActuateType;
import org.w3._1999.xlink.ShowType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indexterm Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSecondary <em>Secondary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getTertiary <em>Tertiary</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSee <em>See</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSeealso <em>Seealso</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSee1 <em>See1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSeealso1 <em>Seealso1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSee2 <em>See2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSeealso2 <em>Seealso2</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getActuate <em>Actuate</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getArch <em>Arch</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getArcrole <em>Arcrole</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getAudience <em>Audience</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getBase <em>Base</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getConformance <em>Conformance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getHref <em>Href</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getId <em>Id</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getLinkend <em>Linkend</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getOs <em>Os</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getPagenum <em>Pagenum</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getRemap <em>Remap</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getRevision <em>Revision</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getRevisionflag <em>Revisionflag</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getRole <em>Role</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getRole1 <em>Role1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSecurity <em>Security</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getShow <em>Show</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getSignificance <em>Significance</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getStartref <em>Startref</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getType <em>Type</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getType1 <em>Type1</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getUserlevel <em>Userlevel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getVendor <em>Vendor</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getWordsize <em>Wordsize</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getXreflabel <em>Xreflabel</em>}</li>
 *   <li>{@link org.docbook.ns.docbook.IndextermType#getZone <em>Zone</em>}</li>
 * </ul>
 *
 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType()
 * @model extendedMetaData="name='indexterm_._type' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface IndextermType extends EObject {
	/**
	 * Returns the value of the '<em><b>Primary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary</em>' containment reference.
	 * @see #setPrimary(PrimaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Primary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='primary' namespace='##targetNamespace'"
	 * @generated
	 */
	PrimaryType getPrimary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getPrimary <em>Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary</em>' containment reference.
	 * @see #getPrimary()
	 * @generated
	 */
	void setPrimary(PrimaryType value);

	/**
	 * Returns the value of the '<em><b>Secondary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary</em>' containment reference.
	 * @see #setSecondary(SecondaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Secondary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secondary' namespace='##targetNamespace'"
	 * @generated
	 */
	SecondaryType getSecondary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSecondary <em>Secondary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secondary</em>' containment reference.
	 * @see #getSecondary()
	 * @generated
	 */
	void setSecondary(SecondaryType value);

	/**
	 * Returns the value of the '<em><b>Tertiary</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tertiary</em>' containment reference.
	 * @see #setTertiary(TertiaryType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Tertiary()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tertiary' namespace='##targetNamespace'"
	 * @generated
	 */
	TertiaryType getTertiary();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getTertiary <em>Tertiary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tertiary</em>' containment reference.
	 * @see #getTertiary()
	 * @generated
	 */
	void setTertiary(TertiaryType value);

	/**
	 * Returns the value of the '<em><b>See</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See</em>' containment reference.
	 * @see #setSee(SeeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_See()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='see' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeType getSee();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSee <em>See</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See</em>' containment reference.
	 * @see #getSee()
	 * @generated
	 */
	void setSee(SeeType value);

	/**
	 * Returns the value of the '<em><b>Seealso</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SeealsoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seealso</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Seealso()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seealso' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeealsoType> getSeealso();

	/**
	 * Returns the value of the '<em><b>See1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See1</em>' containment reference.
	 * @see #setSee1(SeeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_See1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='see' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeType getSee1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSee1 <em>See1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See1</em>' containment reference.
	 * @see #getSee1()
	 * @generated
	 */
	void setSee1(SeeType value);

	/**
	 * Returns the value of the '<em><b>Seealso1</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SeealsoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seealso1</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Seealso1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seealso' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeealsoType> getSeealso1();

	/**
	 * Returns the value of the '<em><b>See2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>See2</em>' containment reference.
	 * @see #setSee2(SeeType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_See2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='see' namespace='##targetNamespace'"
	 * @generated
	 */
	SeeType getSee2();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSee2 <em>See2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>See2</em>' containment reference.
	 * @see #getSee2()
	 * @generated
	 */
	void setSee2(SeeType value);

	/**
	 * Returns the value of the '<em><b>Seealso2</b></em>' containment reference list.
	 * The list contents are of type {@link org.docbook.ns.docbook.SeealsoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seealso2</em>' containment reference list.
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Seealso2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='seealso' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SeealsoType> getSeealso2();

	/**
	 * Returns the value of the '<em><b>Actuate</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ActuateType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #setActuate(ActuateType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Actuate()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='actuate' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ActuateType getActuate();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actuate</em>' attribute.
	 * @see org.w3._1999.xlink.ActuateType
	 * @see #isSetActuate()
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @generated
	 */
	void setActuate(ActuateType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getActuate <em>Actuate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	void unsetActuate();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getActuate <em>Actuate</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Actuate</em>' attribute is set.
	 * @see #unsetActuate()
	 * @see #getActuate()
	 * @see #setActuate(ActuateType)
	 * @generated
	 */
	boolean isSetActuate();

	/**
	 * Returns the value of the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotations</em>' attribute.
	 * @see #setAnnotations(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Annotations()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='annotations'"
	 * @generated
	 */
	Object getAnnotations();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getAnnotations <em>Annotations</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotations</em>' attribute.
	 * @see #getAnnotations()
	 * @generated
	 */
	void setAnnotations(Object value);

	/**
	 * Returns the value of the '<em><b>Arch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arch</em>' attribute.
	 * @see #setArch(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Arch()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arch'"
	 * @generated
	 */
	Object getArch();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getArch <em>Arch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arch</em>' attribute.
	 * @see #getArch()
	 * @generated
	 */
	void setArch(Object value);

	/**
	 * Returns the value of the '<em><b>Arcrole</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcrole</em>' attribute.
	 * @see #setArcrole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Arcrole()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='arcrole' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getArcrole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getArcrole <em>Arcrole</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arcrole</em>' attribute.
	 * @see #getArcrole()
	 * @generated
	 */
	void setArcrole(Object value);

	/**
	 * Returns the value of the '<em><b>Audience</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Audience</em>' attribute.
	 * @see #setAudience(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Audience()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='audience'"
	 * @generated
	 */
	Object getAudience();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getAudience <em>Audience</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Audience</em>' attribute.
	 * @see #getAudience()
	 * @generated
	 */
	void setAudience(Object value);

	/**
	 * Returns the value of the '<em><b>Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' attribute.
	 * @see #setBase(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Base()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='base' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getBase();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getBase <em>Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' attribute.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Object value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ClassType15}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see org.docbook.ns.docbook.ClassType15
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #setClass(ClassType15)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Class()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	ClassType15 getClass_();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see org.docbook.ns.docbook.ClassType15
	 * @see #isSetClass()
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(ClassType15 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClass()
	 * @see #getClass_()
	 * @see #setClass(ClassType15)
	 * @generated
	 */
	void unsetClass();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getClass_ <em>Class</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Class</em>' attribute is set.
	 * @see #unsetClass()
	 * @see #getClass_()
	 * @see #setClass(ClassType15)
	 * @generated
	 */
	boolean isSetClass();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Condition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='condition'"
	 * @generated
	 */
	Object getCondition();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Object value);

	/**
	 * Returns the value of the '<em><b>Conformance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformance</em>' attribute.
	 * @see #setConformance(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Conformance()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='conformance'"
	 * @generated
	 */
	Object getConformance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getConformance <em>Conformance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformance</em>' attribute.
	 * @see #getConformance()
	 * @generated
	 */
	void setConformance(Object value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.DirType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.docbook.ns.docbook.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Href()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='href' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getHref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(Object value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Lang()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	Object getLang();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(Object value);

	/**
	 * Returns the value of the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linkend</em>' attribute.
	 * @see #setLinkend(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Linkend()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='linkend'"
	 * @generated
	 */
	String getLinkend();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getLinkend <em>Linkend</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linkend</em>' attribute.
	 * @see #getLinkend()
	 * @generated
	 */
	void setLinkend(String value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Os()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='os'"
	 * @generated
	 */
	Object getOs();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(Object value);

	/**
	 * Returns the value of the '<em><b>Pagenum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagenum</em>' attribute.
	 * @see #setPagenum(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Pagenum()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='pagenum'"
	 * @generated
	 */
	Object getPagenum();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getPagenum <em>Pagenum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagenum</em>' attribute.
	 * @see #getPagenum()
	 * @generated
	 */
	void setPagenum(Object value);

	/**
	 * Returns the value of the '<em><b>Remap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remap</em>' attribute.
	 * @see #setRemap(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Remap()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='remap'"
	 * @generated
	 */
	Object getRemap();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRemap <em>Remap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remap</em>' attribute.
	 * @see #getRemap()
	 * @generated
	 */
	void setRemap(Object value);

	/**
	 * Returns the value of the '<em><b>Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' attribute.
	 * @see #setRevision(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Revision()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='revision'"
	 * @generated
	 */
	Object getRevision();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRevision <em>Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision</em>' attribute.
	 * @see #getRevision()
	 * @generated
	 */
	void setRevision(Object value);

	/**
	 * Returns the value of the '<em><b>Revisionflag</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.RevisionflagType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Revisionflag()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='revisionflag'"
	 * @generated
	 */
	RevisionflagType getRevisionflag();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revisionflag</em>' attribute.
	 * @see org.docbook.ns.docbook.RevisionflagType
	 * @see #isSetRevisionflag()
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @generated
	 */
	void setRevisionflag(RevisionflagType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRevisionflag <em>Revisionflag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	void unsetRevisionflag();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getRevisionflag <em>Revisionflag</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Revisionflag</em>' attribute is set.
	 * @see #unsetRevisionflag()
	 * @see #getRevisionflag()
	 * @see #setRevisionflag(RevisionflagType)
	 * @generated
	 */
	boolean isSetRevisionflag();

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Role()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role'"
	 * @generated
	 */
	Object getRole();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Object value);

	/**
	 * Returns the value of the '<em><b>Role1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role1</em>' attribute.
	 * @see #setRole1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Role1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='role' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getRole1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getRole1 <em>Role1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role1</em>' attribute.
	 * @see #getRole1()
	 * @generated
	 */
	void setRole1(Object value);

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.ScopeType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.docbook.ns.docbook.ScopeType1
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(ScopeType1)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	ScopeType1 getScope();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.docbook.ns.docbook.ScopeType1
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(ScopeType1 value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType1)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(ScopeType1)
	 * @generated
	 */
	boolean isSetScope();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' attribute.
	 * @see #setSecurity(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Security()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='security'"
	 * @generated
	 */
	Object getSecurity();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSecurity <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security</em>' attribute.
	 * @see #getSecurity()
	 * @generated
	 */
	void setSecurity(Object value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3._1999.xlink.ShowType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #setShow(ShowType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Show()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='show' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	ShowType getShow();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see org.w3._1999.xlink.ShowType
	 * @see #isSetShow()
	 * @see #unsetShow()
	 * @see #getShow()
	 * @generated
	 */
	void setShow(ShowType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	void unsetShow();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getShow <em>Show</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Show</em>' attribute is set.
	 * @see #unsetShow()
	 * @see #getShow()
	 * @see #setShow(ShowType)
	 * @generated
	 */
	boolean isSetShow();

	/**
	 * Returns the value of the '<em><b>Significance</b></em>' attribute.
	 * The literals are from the enumeration {@link org.docbook.ns.docbook.SignificanceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Significance</em>' attribute.
	 * @see org.docbook.ns.docbook.SignificanceType
	 * @see #isSetSignificance()
	 * @see #unsetSignificance()
	 * @see #setSignificance(SignificanceType)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Significance()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='significance'"
	 * @generated
	 */
	SignificanceType getSignificance();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSignificance <em>Significance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significance</em>' attribute.
	 * @see org.docbook.ns.docbook.SignificanceType
	 * @see #isSetSignificance()
	 * @see #unsetSignificance()
	 * @see #getSignificance()
	 * @generated
	 */
	void setSignificance(SignificanceType value);

	/**
	 * Unsets the value of the '{@link org.docbook.ns.docbook.IndextermType#getSignificance <em>Significance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSignificance()
	 * @see #getSignificance()
	 * @see #setSignificance(SignificanceType)
	 * @generated
	 */
	void unsetSignificance();

	/**
	 * Returns whether the value of the '{@link org.docbook.ns.docbook.IndextermType#getSignificance <em>Significance</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Significance</em>' attribute is set.
	 * @see #unsetSignificance()
	 * @see #getSignificance()
	 * @see #setSignificance(SignificanceType)
	 * @generated
	 */
	boolean isSetSignificance();

	/**
	 * Returns the value of the '<em><b>Startref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startref</em>' attribute.
	 * @see #setStartref(String)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Startref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREF"
	 *        extendedMetaData="kind='attribute' name='startref'"
	 * @generated
	 */
	String getStartref();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getStartref <em>Startref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startref</em>' attribute.
	 * @see #getStartref()
	 * @generated
	 */
	void setStartref(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Title()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='title' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getTitle();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(Object value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type' namespace='http://www.w3.org/1999/xlink'"
	 * @generated
	 */
	Object getType();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Object value);

	/**
	 * Returns the value of the '<em><b>Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type1</em>' attribute.
	 * @see #setType1(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Type1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	Object getType1();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getType1 <em>Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type1</em>' attribute.
	 * @see #getType1()
	 * @generated
	 */
	void setType1(Object value);

	/**
	 * Returns the value of the '<em><b>Userlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userlevel</em>' attribute.
	 * @see #setUserlevel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Userlevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='userlevel'"
	 * @generated
	 */
	Object getUserlevel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getUserlevel <em>Userlevel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userlevel</em>' attribute.
	 * @see #getUserlevel()
	 * @generated
	 */
	void setUserlevel(Object value);

	/**
	 * Returns the value of the '<em><b>Vendor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vendor</em>' attribute.
	 * @see #setVendor(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Vendor()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='vendor'"
	 * @generated
	 */
	Object getVendor();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getVendor <em>Vendor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor</em>' attribute.
	 * @see #getVendor()
	 * @generated
	 */
	void setVendor(Object value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	Object getVersion();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Object value);

	/**
	 * Returns the value of the '<em><b>Wordsize</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wordsize</em>' attribute.
	 * @see #setWordsize(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Wordsize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='wordsize'"
	 * @generated
	 */
	Object getWordsize();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getWordsize <em>Wordsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wordsize</em>' attribute.
	 * @see #getWordsize()
	 * @generated
	 */
	void setWordsize(Object value);

	/**
	 * Returns the value of the '<em><b>Xreflabel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xreflabel</em>' attribute.
	 * @see #setXreflabel(Object)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Xreflabel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='xreflabel'"
	 * @generated
	 */
	Object getXreflabel();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getXreflabel <em>Xreflabel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xreflabel</em>' attribute.
	 * @see #getXreflabel()
	 * @generated
	 */
	void setXreflabel(Object value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(List)
	 * @see org.docbook.ns.docbook.DocbookPackage#getIndextermType_Zone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='zone'"
	 * @generated
	 */
	List<String> getZone();

	/**
	 * Sets the value of the '{@link org.docbook.ns.docbook.IndextermType#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(List<String> value);

} // IndextermType
