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
package de.online.adv.namespaces.adv.sk.xml.skadv;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getGeometryType <em>Geometry Type</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getModelClass <em>Model Class</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getFeatureTypeName <em>Feature Type Name</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getFeatureTypeNumber <em>Feature Type Number</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getBasicObjectType <em>Basic Object Type</em>}</li>
 *   <li>{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1()
 * @model extendedMetaData="name='FilterType' kind='elementOnly'"
 * @generated
 */
@ProviderType
public interface FilterType1 extends ElementType1 {
	/**
	 * Returns the value of the '<em><b>Geometry Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.GeometryTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geometrietyp mit den möglichen Werten point, curve, surface.
	 * 
	 * Der Geometrietyp ist optional. Er kann bei der Selektion von REOs als zusätzliches Kriterium neben "featureTypeName" und "modelClass" angegeben werden, um eine Einschränkung auf Features des angegebenen Geometrietyps im "position"-Property zu erzielen. 
	 * 
	 * Bei ZUSOs und NREOs kann der Geometrietyp nicht angegeben werden. Wird er bei REOs nicht angegeben, so erfolgt keine Filterung nach Geometrietyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry Type</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryTypeType
	 * @see #isSetGeometryType()
	 * @see #unsetGeometryType()
	 * @see #setGeometryType(GeometryTypeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_GeometryType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='geometryType' namespace='##targetNamespace'"
	 * @generated
	 */
	GeometryTypeType getGeometryType();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getGeometryType <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry Type</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.GeometryTypeType
	 * @see #isSetGeometryType()
	 * @see #unsetGeometryType()
	 * @see #getGeometryType()
	 * @generated
	 */
	void setGeometryType(GeometryTypeType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getGeometryType <em>Geometry Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeometryType()
	 * @see #getGeometryType()
	 * @see #setGeometryType(GeometryTypeType)
	 * @generated
	 */
	void unsetGeometryType();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getGeometryType <em>Geometry Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Geometry Type</em>' attribute is set.
	 * @see #unsetGeometryType()
	 * @see #getGeometryType()
	 * @see #setGeometryType(GeometryTypeType)
	 * @generated
	 */
	boolean isSetGeometryType();

	/**
	 * Returns the value of the '<em><b>Model Class</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modellart, entsprechend dem AAA-Schema.
	 * 
	 * Um diese Paketreferenz in das AAA-Fachschema nicht bis in SK-XML und MDL durchschlagen zu lassen, wird der Typ AA_Modellart in beiden abgeleiteten Modellen wie ein CharacterString behandelt.
	 * 
	 * Das "modelClass"-Attribut kann multipel angegeben oder auch ganz weggelassen werden. Wenn das Attribut fehlt, so wird die Modellart durch den Filter nicht überprüft. Ansonsten lässt der Filter nur die angegebenen Modellarten zu.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Class</em>' attribute list.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_ModelClass()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='modelClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getModelClass();

	/**
	 * Returns the value of the '<em><b>Feature Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namensraumbehaftete Objektart, z.B. AX_Strassenachse im Namensraum <a href="http://www.adv-online.de/namespaces/adv/gid/6.0"><font color="#0000ff"><u>http://www.adv-online.de/namespaces/adv/gid/6.0</u></font></a>.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type Name</em>' attribute.
	 * @see #setFeatureTypeName(QName)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_FeatureTypeName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.QName" required="true"
	 *        extendedMetaData="kind='element' name='featureTypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	QName getFeatureTypeName();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getFeatureTypeName <em>Feature Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Name</em>' attribute.
	 * @see #getFeatureTypeName()
	 * @generated
	 */
	void setFeatureTypeName(QName value);

	/**
	 * Returns the value of the '<em><b>Feature Type Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Objektartnummer, z.B. 42003.
	 * 
	 * Diese Angabe ist nicht unbedingt erforderlich, da sie sich aus der Objektart (featureTypeName) ergibt.
	 * 
	 * Die Objektartnummer ist zwar eine Zahl, wurde aber als Text modelliert, um auszudrücken, dass führende Nullen Teil der Nummer sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Type Number</em>' attribute.
	 * @see #setFeatureTypeNumber(String)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_FeatureTypeNumber()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='featureTypeNumber' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFeatureTypeNumber();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getFeatureTypeNumber <em>Feature Type Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Type Number</em>' attribute.
	 * @see #getFeatureTypeNumber()
	 * @generated
	 */
	void setFeatureTypeNumber(String value);

	/**
	 * Returns the value of the '<em><b>Basic Object Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.online.adv.namespaces.adv.sk.xml.skadv.BasicObjectTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Objekttyp, "reo" oder "zuso".
	 * 
	 * Diese Angabe ist nicht unbedingt erforderlich, da sie sich aus der Objektart (featureTypeName) ergibt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Object Type</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BasicObjectTypeType
	 * @see #isSetBasicObjectType()
	 * @see #unsetBasicObjectType()
	 * @see #setBasicObjectType(BasicObjectTypeType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_BasicObjectType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='basicObjectType' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicObjectTypeType getBasicObjectType();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getBasicObjectType <em>Basic Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Object Type</em>' attribute.
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.BasicObjectTypeType
	 * @see #isSetBasicObjectType()
	 * @see #unsetBasicObjectType()
	 * @see #getBasicObjectType()
	 * @generated
	 */
	void setBasicObjectType(BasicObjectTypeType value);

	/**
	 * Unsets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getBasicObjectType <em>Basic Object Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBasicObjectType()
	 * @see #getBasicObjectType()
	 * @see #setBasicObjectType(BasicObjectTypeType)
	 * @generated
	 */
	void unsetBasicObjectType();

	/**
	 * Returns whether the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getBasicObjectType <em>Basic Object Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Basic Object Type</em>' attribute is set.
	 * @see #unsetBasicObjectType()
	 * @see #getBasicObjectType()
	 * @see #setBasicObjectType(BasicObjectTypeType)
	 * @generated
	 */
	boolean isSetBasicObjectType();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Rolle "expression" liefert einen logischen Ausdruck, der definiert, ob das laufende Objekt zugelassen wird oder nicht. Der Defaultwert ist 'true'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(ExpressionType)
	 * @see de.online.adv.namespaces.adv.sk.xml.skadv.AAAPackage#getFilterType1_Expression()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='expression' namespace='##targetNamespace'"
	 * @generated
	 */
	ExpressionType getExpression();

	/**
	 * Sets the value of the '{@link de.online.adv.namespaces.adv.sk.xml.skadv.FilterType1#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(ExpressionType value);

} // FilterType1
